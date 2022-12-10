package bai3;

import java.util.Scanner;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private long zipCode;

    public Address() {
    }

    public Address(String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }
    public void inputAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Street address: ");
        streetAddress = sc.nextLine();
        System.out.print("City: ");
        city = sc.nextLine();
        System.out.print("State: ");
        state = sc.nextLine();
        System.out.print("Zipcode: ");
        zipCode = sc.nextLong();
    }
    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
