package fr.gtm.formation;

import fr.gtm.formation.model.Person;
import fr.gtm.formation.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan("fr.gtm.formation")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
            repository.save(new Person(1, "BELHADEF", "Rabah"));;
            repository.save(new Person(2, "TOTO", "TATA"));;
        };
    }
}

