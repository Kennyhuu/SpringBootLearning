package postgres_docker_infrastructure.postgres_docker_infrastructure.Service;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Entity.Customer;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(String firstName, String lastName){

        Customer newCustomer = new Customer();
        newCustomer.setFirstName(firstName);
        newCustomer.setLastName(lastName);
        System.out.println("Saving new customer...");
        this.customerRepository.save(newCustomer);

    }

    public String getAllCustomer(){
        List allCustomers = this.customerRepository.findAll();
        return "Number of customers: " + allCustomers.size();
    }
}
