package com.maingroup.SpringBootProjects.Controller;

import com.maingroup.SpringBootProjects.Components.Person;
import com.maingroup.SpringBootProjects.Components.PersonComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController //web dependency - allows us to use the REST API
public class HTTPMethod {

    @Autowired
    PersonComponent personComp;

    @GetMapping("/person/fn/{firstName}/ln/{lastName}") //shows us how to use the GET + url
    public ResponseEntity<Person> getCustomMessage( //ResponseEntity is to play with the http status of the request
            @RequestHeader(value = "clientId", required = true) String clientId,
            @PathVariable(value = "firstName") String fName, //takes variable from arguments
            @PathVariable(value = "lastName") String lName, //takes variable from arguments
            @RequestParam Optional<String> age //takes variable by requesting it ?age=21 , (integer) if you put letters next to it, you get 400 bad rqst
    ){
        Person person = personComp.getPerson(fName,lName,age);

        if (!clientId.equalsIgnoreCase("test1")){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }

        if (person != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(person);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @PostMapping(value="/addPerson")
    public ResponseEntity<Person> createPerson(
            @RequestBody Person person
            ){
        return ResponseEntity.ok().body(person);
    }

    @PutMapping(value="/modifyPerson")
    public ResponseEntity<Person> modifyPerson(
            @RequestBody Person person
    ){
        return ResponseEntity.ok().body(person);
    }

    @DeleteMapping(value="/deletePerson")
    public ResponseEntity<Person> deletePerson(
            @RequestBody Person person
    ){
        return ResponseEntity.ok().body(person);
    }
}