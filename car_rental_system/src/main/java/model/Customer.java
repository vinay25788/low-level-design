package model;

public class Customer {

    String name;
    String email;
    String driverLicense;

    public Customer(String name, String email, String driverLicense)
    {
        this.name = name;
        this.email = email;
        this.driverLicense = driverLicense;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDriverLicense() {
        return driverLicense;
    }
}
