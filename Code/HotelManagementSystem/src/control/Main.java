package control;

import boundary.GUI_Login;
import entity.*;

import javax.swing.*;

/**
 * Created by Ross on 04/04/2015.
 */
public class Main

{
    // main method
    public static void main(String[] args) {

        I_Room room = new RoomBreakfast(new RoomKingSize(new RoomMinibar(new RoomOnSuite(new Room("Special", "Special Offer", 99, 20)))));

        JOptionPane.showMessageDialog(null, "jim 123 = Manager"
                + "\npat 456 = Receptionist"
                + "\njoe 789 = Guest", null, 1);

        JOptionPane.showMessageDialog(null, room.getDescription() + "\nCost: " + room.getCost(), "Special Offer!", 1);

        GUI_Login loginBox = new GUI_Login();
        loginBox.displayGUI();

    }
}
