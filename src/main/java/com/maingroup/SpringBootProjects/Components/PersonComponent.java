package com.maingroup.SpringBootProjects.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component //Spring Manage component
public class PersonComponent {

    @Autowired
    PersonService perSvc;

    public Person getPerson(String fName, String lName, Optional<String> age){
        Integer personAge = perSvc.getAge(age);
        return perSvc.getService(fName, lName, personAge);
    }
}
