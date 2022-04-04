package com.maingroup.SpringBootProjects.Components;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PersonComponent {

    public Person getPerson(String fName, String lName, Optional<String> age){
        Integer personAge = 0;
        if (age.isPresent()) {
            try {
                personAge = Integer.parseInt(age.get());
            } catch (Exception e) {
                return null;
            }
            Person person = new Person(fName,lName,personAge);
            return person;
        }
        Person person = new Person(fName,lName);
        return person;
    }
}
