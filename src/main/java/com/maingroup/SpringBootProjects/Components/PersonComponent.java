package com.maingroup.SpringBootProjects.Components;

import com.maingroup.SpringBootProjects.Exception.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Spring Manage Component - does the details work here.
 */
@Component
public class PersonComponent {

    @Autowired
    PersonService perSvc;

    /**
     * Getting the Person object after obtaining his details and age.
     * @param fName first name of Person
     * @param lName last name of Person
     * @param age age of Person
     * @return returns the details of the person
     * @throws SystemException customized message of System Exception
     */
    public Person getPerson(String fName, String lName, Optional<String> age) throws SystemException {
        Integer personAge = perSvc.getAge(age);
        return perSvc.getService(fName, lName, personAge);
    }
}
