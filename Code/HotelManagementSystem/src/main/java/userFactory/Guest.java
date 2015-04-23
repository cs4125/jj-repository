package userFactory;

import userFactory.User;

/**
 * Created by Ross on 24/03/2015.
 */
public class Guest extends User
{
    private String passportNumber;
    private String address;
    private String telephone;

    public Guest(String username, String password, String userType) {
        super(username, password, userType);
    }

    public Guest(String username, String password, String userType, String passportNumber, String address, String telephone)
    {
        super(username, password, userType);
        this.passportNumber = passportNumber;
        this.address = address;
        this.telephone = telephone;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
