package sample.cpro1221_javafx_project_sample.model;

public class BillingAddresses {
    public BillingAddresses(String account_id, String streetAdress, String apartmentNumber, String city, String state, String zipcode) {
        this.account_id = account_id;
        this.streetAdress = streetAdress;
        ApartmentNumber = apartmentNumber;
        this.city = city;
        State = state;
        Zipcode = zipcode;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getApartmentNumber() {
        return ApartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        ApartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    private String account_id;
    private String streetAdress;
    private String ApartmentNumber;
    private String city;
    private  String State;
    private String Zipcode;
}
