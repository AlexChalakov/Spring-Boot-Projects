package com.maingroup.SpringBootProjects.Components;

import com.maingroup.SpringBootProjects.Exception.SystemException;
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

    public Integer getAge(Optional<String> age) throws SystemException{ //important to nor forget to throw exception
        if (age.isPresent()) {
            try {
                return Integer.parseInt(age.get());
            } catch (Exception e) {
                throw new SystemException("103", "Age is not an Integer with msg: " + e.getMessage()); //instead ot handling it, it throws custom exception
            }
        }
        return null;
    }
}
