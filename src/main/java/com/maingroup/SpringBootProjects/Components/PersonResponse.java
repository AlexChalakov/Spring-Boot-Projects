package com.maingroup.SpringBootProjects.Components;

import com.maingroup.SpringBootProjects.Exception.PersonError;

/**
 * Personalized response for any Person Object.
 */
public class PersonResponse {

    private Person person;
    private PersonError error;

    /**
     * Default constructor, which the Rest API uses.
     */
    public PersonResponse() {}

    /**
     * Constructor for the Person customized response.
     * @param person Person object we specify.
     * @param error error that is thrown.
     */
    public PersonResponse(Person person, PersonError error) {
        super();
        this.person = person;
        this.error = error;
    }

    //Getters and Setters
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonError getError() {
        return error;
    }

    public void setError(PersonError error) {
        this.error = error;
    }
}
