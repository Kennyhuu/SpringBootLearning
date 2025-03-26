package postgres_docker_infrastructure.postgres_docker_infrastructure.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Entity.Customer;
import postgres_docker_infrastructure.postgres_docker_infrastructure.PostgresDockerInfrastructureApplication;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Repository.CustomerRepository;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private static final Logger logger = LogManager.getLogger(CustomerController.class);
    private final CustomerService customerService;
    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerRepository repository) {
        this.customerService = customerService;
        this.repository = repository;
    }

    @GetMapping("/hallo")
    public String helloword(){
        return "Hello Here is Khiem";
    }

    @PostMapping("/newCustomer")
    public void newCustomer(){
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        logger.info("Saving new customer...");
        this.repository.save(newCustomer);
    }
}
