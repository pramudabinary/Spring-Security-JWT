package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/4/21
 **/

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    Customer findByUserName(String username);
}
