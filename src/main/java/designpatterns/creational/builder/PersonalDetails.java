package designpatterns.creational.builder;

import java.util.Date;

public class PersonalDetails {

    private String name;
    private int age;
    private Date dob;
    private String email;
    private String phoneNumber;

    public PersonalDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonalDetails(String name, int age, Date dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public PersonalDetails(String name, int age, Date dob, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
