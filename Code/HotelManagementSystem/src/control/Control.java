package control;

import entity.Guest;
import entity.Manager;
import entity.Receptionist;
import entity.User;

import java.awt.*;

/**
 * Created by Ross on 23/03/2015.
 */
public class Control  {

    boolean isValidUser;
    String username, password, userType;



    public Control() {
        isValidUser = false;
    }

    boolean processLogIn()
    {
        User actor = new User();
        if(actor.getPassword(actor.getUsername()).equals(password))
        {
            userType=actor.getUserType();

            if(userType.equals("Manager")) {
                ManagerMethods loggedInUser = new ManagerMethods();
                Manager manager = new Manager();
            }
            else if(userType.equals("Receptionist"))
            {
                ReceptionistMethods loggedInUser = new ReceptionistMethods();
                Receptionist receptionist = new Receptionist();
            }
            else if(userType.equals("Guest")) {
                GuestMethods loggedInUser = new GuestMethods();
                Guest guest = new Guest();
            }
        }
        return false;
    }

    String browseRooms()
    {
        return null;
    }

}
