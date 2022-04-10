package com.maingroup.SpringBootProjects.Exception;

/**
 * Error specified by Person.
 */
public class PersonError {

    private String errorID;
    private String errorMessage;

    /**
     * Default constructor, which the Rest API uses.
     */
    public PersonError() {}

    /**
     * Personalized Person error.
     * @param errorID ID of error.
     * @param errorMessage message of error.
     */
    public PersonError(String errorID, String errorMessage){
        super();
        this.errorID = errorID;
        this.errorMessage = errorMessage;
    }

    //Getters and Setters.
    public String getErrorID() {
        return errorID;
    }

    public void setErrorID(String errorID) {
        this.errorID = errorID;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
