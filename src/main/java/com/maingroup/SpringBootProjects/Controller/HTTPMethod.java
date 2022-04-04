package com.maingroup.SpringBootProjects.Controller;

import com.maingroup.SpringBootProjects.Components.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController //web dependency - allows us to use the REST API
public class HTTPMethod {

    @GetMapping("/person/fn/{firstName}/ln/{lastName}") //shows us how to use the GET + url
    public ResponseEntity<Person> getCustomMessage( //ResponseEntity is to play with the http status of the request
            @PathVariable(value = "firstName") String fName, //takes variable from arguments
            @PathVariable(value = "lastName") String lName, //takes variable from arguments
            @RequestParam Optional<String> age //takes variable by requesting it ?age=21 , (integer) if you put letters next to it, you get 400 bad rqst
    ){
        Integer personAge = 0;
        if (age.isPresent()) {
            try {
                personAge = Integer.parseInt(age.get());
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    //.body("Age should be Numeric");
                    .body(null);
            }
            Person person = new Person(fName,lName,personAge);
            return ResponseEntity.status(HttpStatus.OK)
                    //.body("My name is " + fName + " " + lName
                            //+ " and my age is: " + personAge);
                    .body(person);
        }
        Person person = new Person(fName,lName);
        return ResponseEntity.status(HttpStatus.OK)
                //.body("My name is " + fName + " " + lName);
                .body(person);
    }
}