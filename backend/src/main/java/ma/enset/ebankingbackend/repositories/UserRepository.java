package ma.enset.digital-bankingbackend.repositories;

import ma.enset.digital-bankingbackend.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

}
