package ma.enset.digital-bankingbackend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()

public class DigitalBankingBackendApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().load();

        System.setProperty("spring.data.mongodb.uri", dotenv.get("MONGODB_URI"));
        System.setProperty("spring.data.mongodb.database", dotenv.get("MONGODB_DATABASE"));
        System.setProperty("jwt.secret", dotenv.get("JWT_SECRET"));

        SpringApplication.run(DigitalBankingBackendApplication.class, args);
    }

}
