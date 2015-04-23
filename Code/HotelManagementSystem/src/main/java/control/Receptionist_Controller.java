package control;

// Receptionist has Control_Guest 

import boundary.Receptionist_UI;
import userFactory.Receptionist;

// a Receptionist has unique Control_Receptionist
public class Receptionist_Controller {

    Receptionist_UI gui_receptionist;

    public Receptionist_Controller(Receptionist receptionist)
    {
        gui_receptionist = new Receptionist_UI();
        gui_receptionist.displayGUI(receptionist.getUsername());
    }

}
