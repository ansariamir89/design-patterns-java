package designpatterns.creational.builder;

public class UserDetails {

    private PersonalDetails personalDetails;
    private QualificationDetails qualificationDetails;
    private Address address;
    private EmploymentDetails employmentDetails;

    private UserDetails(){}

    public static UserDetailsBuilder builder() {
        return new UserDetailsBuilder();
    }


    public static class UserDetailsBuilder{

        private UserDetails userDetails = new UserDetails();

        public UserDetailsBuilder setPersonalDetails(PersonalDetails personalDetails){
            userDetails.personalDetails = personalDetails;
            return this;
        }
        public UserDetailsBuilder setQualificationDetails(QualificationDetails qualificationDetails){
            userDetails.qualificationDetails = qualificationDetails;
            return this;
        }
        public UserDetailsBuilder setAddress(Address address){
            userDetails.address = address;
            return this;
        }
        public UserDetailsBuilder setEmploymentDetails(EmploymentDetails employmentDetails){
            userDetails.employmentDetails = employmentDetails;
            return this;
        }

        public UserDetails build(){
            return userDetails;
        }


    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "personalDetails=" + personalDetails +
                ", qualificationDetails=" + qualificationDetails +
                ", address=" + address +
                ", employmentDetails=" + employmentDetails +
                '}';
    }
}
