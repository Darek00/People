package pl.akademiakodu.people;

import javax.persistence.*;

/*
    Entity sprawia, że w bazie dane jest tworzona tabela user
 */

@Entity // This tells Hibernate to make a table out of this class
public class User {

    /*
        Adnotacja Id sprawia, że pole staje się kluczem głównym
        w bazie danych
        GeneratedValue ustala w jaki sposób będą generowane ID w bazie danych
        trochę do pominięcia dla Junirów
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    // w bazie danych będzie name
    private String name;

    // w bazie danych będzie email
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}