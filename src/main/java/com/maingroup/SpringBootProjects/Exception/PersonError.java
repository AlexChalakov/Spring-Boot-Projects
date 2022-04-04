package com.maingroup.SpringBootProjects.Exception;

public class PersonError {

    private String errorID;
    private String errorMessage;

    public PersonError() {}

    public PersonError(String errorID, String errorMessage){
        super();
        this.errorID = errorID;
        this.errorMessage = errorMessage;
    }

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
