package bai3.service;

import bai3.Address;
import bai3.Student;

import java.util.Scanner;

public class StudentService {
    public Student addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Home address");
        Address homeAddress = new Address();
        homeAddress.inputAddress();
        System.out.println("School address");
        Address schoolAddress = new Address();
        schoolAddress.inputAddress();
        return new Student( firstName, lastName, homeAddress, schoolAddress);
    }

    public Address inputAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Street address: ");
        String streetAddress = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zipcode: ");
        long zipCode = sc.nextLong();
        return new Address(streetAddress, city, state, zipCode);
    }
}
