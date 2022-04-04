package com.maingroup.SpringBootProjects.Components;

import com.maingroup.SpringBootProjects.Exception.PersonError;

public class PersonResponse {

    private Person person;
    private PersonError error;

    public PersonResponse() {}

    public PersonResponse(Person person, PersonError error) {
        super();
        this.person = person;
        this.error = error;
    }

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
