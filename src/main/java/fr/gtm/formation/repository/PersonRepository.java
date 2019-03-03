package fr.gtm.formation.repository;


//import org.springframework.data.jpa.fr.gtm.formation.repository.JpaRepository;

import fr.gtm.formation.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findByFirstName(String name) ;
}
