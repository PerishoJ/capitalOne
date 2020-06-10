package cognizant.capital.one.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
@Entity
public class Customer {
    @Id
    long custId;
    String firstName;
    String lastName  ;
    String addressLine1  ;
    String addressLine2  ;
    String city  ;
    String state ;
    String zipcode;
    Date created;
    Date date;
}



