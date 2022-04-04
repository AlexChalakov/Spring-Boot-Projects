package com.maingroup.SpringBootProjects.Exception;

public class BusinessException extends RuntimeException{

    private String errID;
    private String msg;

    public BusinessException(String errID, String msg){
        super();
        this.errID = errID;
        this.msg = msg;
    }

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
