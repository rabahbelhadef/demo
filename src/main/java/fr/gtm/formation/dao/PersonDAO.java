package fr.gtm.formation.dao;

import fr.gtm.formation.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import sun.dc.path.PathError;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

//@Repository
//@Scope("prototype")
public class PersonDAO {

    //@Autowired
    private EntityManager entityManager;

    public List<Person> getPersonList() {
        return entityManager.createQuery("SELECT p FROM Person", Person.class)
                .getResultList();
    }


    public void save(Person person) {
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(person);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    @Transactional
    public void save2(Person person) {
        entityManager.persist(person);
    }

}
