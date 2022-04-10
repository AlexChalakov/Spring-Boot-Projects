package com.maingroup.SpringBootProjects.Components;

/**
 * Main Person object class.
 */
public class Person {

    private String fName;
    private String lName;
    private int age;

    /**
     * Default constructor, which the Rest API uses.
     */
    public Person(){} //default constructor

    /**
     * Constructing the person and its data.
     * @param fName first name.
     * @param lName last name.
     * @param age age.
     */
    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    /**
     * Same constructor but without the age, since it is optional.
     * @param fName first name.
     * @param lName last name.
     */
    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    //Getters and Setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
