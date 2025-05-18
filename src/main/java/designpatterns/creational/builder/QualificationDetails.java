package designpatterns.creational.builder;

public class QualificationDetails {

    private String maxQualification;

    public QualificationDetails(String maxQualification) {
        this.maxQualification = maxQualification;
    }

    @Override
    public String toString() {
        return "QualificationDetails{" +
                "maxQualification='" + maxQualification + '\'' +
                '}';
    }
}
