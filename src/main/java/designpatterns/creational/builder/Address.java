package designpatterns.creational.builder;

public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String pincode;

    public Address(String houseNumber, String street, String city, String state, String pincode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
