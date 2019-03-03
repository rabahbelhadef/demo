package fr.gtm.formation.service;

import fr.gtm.formation.dao.PersonDAO;
import fr.gtm.formation.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("personService")
@Profile("dev")
public class PersonserviceDev implements PersonService {

    @Override
    public String getProfile() {
        return "Je suis en dev";
    }
}
