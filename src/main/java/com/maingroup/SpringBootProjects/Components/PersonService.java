package com.maingroup.SpringBootProjects.Components;

import com.maingroup.SpringBootProjects.Exception.SystemException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Just like the Component service, but there is business logic here, getting the Age and the details of Person object.
 */
@Service
public class PersonService {

    /**
     * Getting the body(details) of the Person object.
     * @param fName first name of Person
     * @param lName last name of Person
     * @param age age of Person
     * @return details of Person
     */
    public Person getService(String fName, String lName, Integer age){
        if (age != null){
            return new Person(fName, lName, age);
        }
        return new Person(fName,lName);
    }

    /**
     * Getting the age of the Person object.
     * @param age age as an optional parameter.
     * @return returns age converted into Integer, or appropriate error.
     * @throws SystemException customizing the System Exception.
     */
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
