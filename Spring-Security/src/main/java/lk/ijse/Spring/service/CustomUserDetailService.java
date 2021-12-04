package lk.ijse.Spring.service;

import lk.ijse.Spring.entity.Customer;
import lk.ijse.Spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/4/21
 **/
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private CustomerRepo repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = repository.findByUserName(username);
        return new org.springframework.security.core.userdetails.
                User(customer.getUsername(), customer.getPassword(), new ArrayList<>());
    }

}
