package control;

import boundary.GUI_NewUser;
import entity.Guest;
import entity.User;

public class Control_NewUser {

    private GUI_NewUser gui_newUser;

    public Control_NewUser()
    {
        gui_newUser = new GUI_NewUser();
        gui_newUser.displayGUI();
    }

    public Control_NewUser(String username, String password, String address, String passport, String telephone)
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
        Control_Login control_guest = new Control_Login(username, password);
        control_guest.login();
    }

    private void addNewUser(Guest newGuest)
    {
        // static call to database in Control_Login
        Control_Login.singletonDatabase.getRegisteredUsers().add(newGuest);
       // JOptionPane.showMessageDialog(null, "Created new " + newGuest.getUsername() + "\nPassport number = " + newGuest.getPassportNumber(), "New User", JOptionPane.INFORMATION_MESSAGE);

    }

}

