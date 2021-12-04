package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/4/21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Document(collection="Customer")
public class Customer {
    @Id
    private String id;
    private String name;
    private String username;
    private String address;
    private String salary;
    private String password;
}
