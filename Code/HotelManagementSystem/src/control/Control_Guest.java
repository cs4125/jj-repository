package control;

import boundary.GUI_Guest;
import entity.*;

import javax.swing.JOptionPane;

public class Control_Guest {

    private final GUI_Guest gui_guest;

    public Control_Guest(Guest guest)
    {
        gui_guest = new GUI_Guest();
        gui_guest.displayGUI(guest.getUsername());

     //   JOptionPane.showMessageDialog(null, "This is Guest : " + guest.getUsername() + "\nAddress: " + guest.getAddress(), null, 1);

    }
    private void browseRooms() {

    }

    private void makeReservation() {
        JOptionPane.showMessageDialog(null, "All : makeReservation", null, 1);
    }

    private void editReservation() {
        JOptionPane.showMessageDialog(null, "All : editReservation", null, 1);
    }

    private void deleteReservation() {
        JOptionPane.showMessageDialog(null, "All : deleteReservation", null, 1);
    }

}
