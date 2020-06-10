package cognizant.capital.one.demo.controller;

import cognizant.capital.one.demo.dto.Account;
import cognizant.capital.one.demo.dto.Customer;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApplicationController {

//    @GetMapping("/allCustomers")
//    public List<Customer> getCustomerByName(){
//        return null;
//    }
//
//    @GetMapping("/customer/{firstName}/{lastName}")
//    public List<Customer> getCustomerByName(@PathVariable String firstName, @PathVariable String lastName){
//        return null;
//    }

    @GetMapping("/customer/{customerId}")
    public List<Customer> getCustomerById(@PathVariable int customerId ){
        return null;
    }

    @GetMapping("/allAccounts")
    public List<Account> getAllAccount(){
        return new ArrayList<Account>();
    }



    @GetMapping("/accounts/{accountId}")
    public List<Account> findAccountById(@PathVariable int accountId){
        return new ArrayList<Account>();
    }

    @GetMapping("/balance/{accountId}")
    public int getBalance(@PathVariable int accountId) {
        return 0 ;
    }

    @PostMapping("/transaction/{account}")
    public int deposit(@PathParam("amount") int amount, @PathVariable int account) {
        return 0;
    }



}
