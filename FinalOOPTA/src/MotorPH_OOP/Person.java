/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String birthday;
    
    public Person() {}

    // Constructor
    public Person(String firstName, String lastName, String address, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Common method to return full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Abstract method to enforce role implementation in subclasses
    public abstract String getRole();
}
