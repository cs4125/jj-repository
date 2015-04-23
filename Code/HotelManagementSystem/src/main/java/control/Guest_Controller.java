package control;

import boundary.Guest_UI;
import userFactory.Guest;

import javax.swing.JOptionPane;

public class Guest_Controller {

    private Guest_UI gui_guest;
    public Guest guest;

    public Guest_Controller(Guest guest)
    {
        this.guest = guest;
        gui_guest = new Guest_UI();
        gui_guest.displayGUI(guest.getUsername());
    }


}
