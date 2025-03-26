package postgres_docker_infrastructure.postgres_docker_infrastructure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Entity.Customer;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Repository.CustomerRepository;
import postgres_docker_infrastructure.postgres_docker_infrastructure.Service.CustomerService;

import java.util.List;

@SpringBootApplication
public class PostgresDockerInfrastructureApplication {


	@Autowired
	private CustomerRepository repository;
	private static final Logger logger = LogManager.getLogger(PostgresDockerInfrastructureApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(PostgresDockerInfrastructureApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		List<Customer> allCustomers = this.repository.findAll();
		logger.info("Number of customers: " + allCustomers.size());

		Customer newCustomer = new Customer();
		newCustomer.setFirstName("John");
		newCustomer.setLastName("Doe");
		logger.info("Saving new customer...");
		this.repository.save(newCustomer);

		allCustomers = this.repository.findAll();
		logger.info("Number of customers: " + allCustomers.size());

	}
}
