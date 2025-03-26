package postgres_docker_infrastructure.postgres_docker_infrastructure.Repository;


import postgres_docker_infrastructure.postgres_docker_infrastructure.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }