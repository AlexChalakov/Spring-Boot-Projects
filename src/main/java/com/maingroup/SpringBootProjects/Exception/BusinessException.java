package com.maingroup.SpringBootProjects.Exception;

/**
 * Business Exception which would be applied for whenever the business logic fails.
 */
public class BusinessException extends RuntimeException{

    private String errID;
    private String msg;

    /**
     * Constructor of business exception.
     * @param errID ID of error.
     * @param msg message of error.
     */
    public BusinessException(String errID, String msg){
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
