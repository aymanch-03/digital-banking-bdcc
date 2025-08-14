package ma.enset.digital-bankingbackend.dtos;

import lombok.Data;
import ma.enset.digital-bankingbackend.enums.Role;

import java.util.Set;

@Data
public class CreateUserRequest {
    private String username;
    private String password;
    private String email;
    private Set<Role> roles;
}
