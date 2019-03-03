package fr.gtm.formation.model;

//
//import lombok.Data;
//
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "person_toto")
public class Person {

    @Id
    private Integer id ;
    private String name ;
    private String firstName ;

}
