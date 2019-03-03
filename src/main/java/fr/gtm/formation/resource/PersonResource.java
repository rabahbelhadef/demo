package fr.gtm.formation.resource;

import fr.gtm.formation.model.Person;
import fr.gtm.formation.repository.PersonRepository;
import fr.gtm.formation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonResource {

    @Autowired
    private PersonRepository repository;

//    @Autowired
//    @Qualifier("ps1")
//    PersonService personService ;

    @Autowired
    @Qualifier("personService")
    PersonService personService ;


    @Autowired
    ApplicationContext context ;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Salut";
    }

    @RequestMapping(value = "/listPerson", method = RequestMethod.GET)
    public List<Person> getListPerson() {
        return repository.findAll();
    }


    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person getPerson() {
        return repository.findByFirstName("BELHADEF");
    }


    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getProfile(){
        return personService.getProfile() ;
    }

}


