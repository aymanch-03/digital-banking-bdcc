package ma.enset.digital-bankingbackend.services;

import ma.enset.digital-bankingbackend.dtos.CreateUserRequest;
import ma.enset.digital-bankingbackend.entities.User;

public interface UserService {
    User createUser(CreateUserRequest request);
}
