package com.maingroup.SpringBootProjects.Components;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service //Like Component but this indicates that there is business logic here
public class PersonService {

    public Person getService(String fName, String lName, Integer age){
        if (age != null){
            return new Person(fName, lName, age);
        }
        return new Person(fName,lName);
    }

    public Integer getAge(Optional<String> age){
        if (age.isPresent()) {
            try {
                return Integer.parseInt(age.get());
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
