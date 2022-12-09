package bai3;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;

    public Student() {
    }

    public Student( String firstName, String lastName, Address homeAddress, Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homeAddress=" + homeAddress +
                ", schoolAddress=" + schoolAddress +
                '}';
    }
}
