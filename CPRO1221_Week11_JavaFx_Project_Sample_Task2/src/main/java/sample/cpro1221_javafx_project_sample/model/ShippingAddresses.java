package sample.cpro1221_javafx_project_sample.model;

public class ShippingAddresses {
    private String account_id;
    private String street_address;
    private String apartment_number;
    private String city;
    private String state;
    private String zipcode;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getApartment_number() {
        return apartment_number;
    }

    public void setApartment_number(String apartment_number) {
        this.apartment_number = apartment_number;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public ShippingAddresses(String account_id, String street_address, String apartment_number, String city, String state, String zipcode) {
        this.account_id = account_id;
        this.street_address = street_address;
        this.apartment_number = apartment_number;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
}
