package ma.enset.digital-bankingbackend.repositories;

import ma.enset.digital-bankingbackend.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByNameContainingIgnoreCase(String keyword);
}
