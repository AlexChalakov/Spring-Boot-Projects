package com.maingroup.SpringBootProjects.Exception;

/**
 * System exception for whenever something within the system fails.
 */
public class SystemException extends RuntimeException {

    private String errID;
    private String msg;

    /**
     * Constructor for the system exception.
     * @param errID ID of error.
     * @param msg message of error.
     */
    public SystemException(String errID, String msg){
        super();
        this.errID = errID;
        this.msg = msg;
    }

    //Getters and Setters
    public String getErrID() {
        return errID;
    }

    public void setErrID(String errID) {
        this.errID = errID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
