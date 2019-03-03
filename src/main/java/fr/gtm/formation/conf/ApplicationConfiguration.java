package fr.gtm.formation.conf;

import fr.gtm.formation.model.Person;
import fr.gtm.formation.repository.PersonRepository;
import fr.gtm.formation.service.PersonService;
import fr.gtm.formation.service.PersonserviceDev;
import fr.gtm.formation.service.PersonserviceProd;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;
import javax.transaction.Transactional;

@Configuration
//@ComponentScan({"packa" , "pack2"})
public class ApplicationConfiguration {


    @Bean("ps1")
//    @Qualifier("ps1")

   // @Scope("prototype")
    public PersonService personService(){
        return new PersonserviceDev() ;
    }

    @Bean("ps2")
    //@Scope("prototype")
  //  @Qualifier("ps2")
    public PersonService personService2(){
            return new PersonserviceProd() ;
    }



//    @Bean
//    public LocalEntityManagerFactoryBean emf(){
//        LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean() ;
//        //TODO : add perperties.
//        return emf ;
//    }
//
//    @Bean
//    public TransactionManager transactionalManager(){
//        TransactionManager tmx = new
//        return  ;
//    }
//
//    @Bean
//    DataSource dataSource(){
//        return new DataSourceFactory().getDataSource() ;
//    }
}
