package userFactory;

import boundary.NewUser_UI;
import control.Login_Controller;

import javax.swing.*;

public class NewUser_Controller {

    private NewUser_UI newUserUI;

    public NewUser_Controller()
    {
        newUserUI = new NewUser_UI();
        newUserUI.displayGUI();
    }

    public NewUser_Controller(String username, String password, String address, String passport, String telephone)
    {
        // create an instance of UserFactory to create a new Guest
        UserFactory user = new UserFactory();
        User newUser = user.createUser(username, password, "Guest");
        // cast to Guest
        Guest newGuest = (Guest)newUser;
        // set details
        newGuest.setAddress(address);
        newGuest.setPassportNumber(passport);
        newGuest.setTelephone(telephone);
        // add new Guest
        addNewUser(newGuest);
        // go through Control_Login to validate new User is in the System
        Login_Controller control_guest = new Login_Controller(newGuest.getUsername(), newGuest.getPassword().toString());
        control_guest.login();
    }

    private void addNewUser(Guest newGuest)
    {
        // static call to database in Control_Login
        Login_Controller.singletonDatabase.getRegisteredUsers().add(newGuest);
        JOptionPane.showMessageDialog(null, "Created new " + newGuest.getUsername() + "\nPassport number = " + newGuest.getPassportNumber(), "New User", JOptionPane.INFORMATION_MESSAGE);

    }

}

