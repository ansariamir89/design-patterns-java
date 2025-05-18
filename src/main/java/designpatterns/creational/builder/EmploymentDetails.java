package designpatterns.creational.builder;

import java.util.Date;

public class EmploymentDetails {

    private String employerName;
    private Date joiningdate;
    private double salary;
    private float experienceInYears;

    public EmploymentDetails(String employerName, Date joiningdate) {
        this.employerName = employerName;
        this.joiningdate = joiningdate;
    }

    public EmploymentDetails(String employerName, Date joiningdate, float experienceInYears) {
        this.employerName = employerName;
        this.joiningdate = joiningdate;
        this.experienceInYears = experienceInYears;
    }

    public EmploymentDetails(String employerName, Date joiningdate, double salary, float experienceInYears) {
        this.employerName = employerName;
        this.joiningdate = joiningdate;
        this.salary = salary;
        this.experienceInYears = experienceInYears;
    }

    @Override
    public String toString() {
        return "EmploymentDetails{" +
                "employerName='" + employerName + '\'' +
                ", joiningdate=" + joiningdate +
                ", salary=" + salary +
                ", experienceInYears=" + experienceInYears +
                '}';
    }
}
