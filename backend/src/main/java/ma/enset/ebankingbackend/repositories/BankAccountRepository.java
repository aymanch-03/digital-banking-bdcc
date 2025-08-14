package ma.enset.digital-bankingbackend.repositories;

import ma.enset.digital-bankingbackend.entities.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BankAccountRepository extends MongoRepository<BankAccount, String> {
    Optional<BankAccount> findTopByOrderByDateCreatedDesc();

    List<BankAccount> findByCustomerId(String customerId);
}
