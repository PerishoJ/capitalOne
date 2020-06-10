package cognizant.capital.one.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Account {
    String accountType;
    @Id
    int accountNumber;
    float balance;
    Date created;
    Date lastUpdated ;
    AccountStatus status;
    long custId;
}

