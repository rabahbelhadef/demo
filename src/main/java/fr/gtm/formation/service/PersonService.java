package fr.gtm.formation.service;

import fr.gtm.formation.dao.PersonDAO;
import fr.gtm.formation.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    String getProfile();
}
