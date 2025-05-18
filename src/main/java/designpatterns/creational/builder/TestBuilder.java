package designpatterns.creational.builder;

import java.util.Date;

public class TestBuilder {

    public static void main(String[] args) {

        UserDetails userDetails = UserDetails.builder()
                .setPersonalDetails(new PersonalDetails("John", 31))
                .setEmploymentDetails(new EmploymentDetails("Employer", new Date()))
                .setQualificationDetails(new QualificationDetails("MCA"))
                .setAddress(new Address("101", "Vigyan Nagar", "Kota", "Rajasthan", "302025"))
                .build();

        System.out.println(userDetails);
    }

}
