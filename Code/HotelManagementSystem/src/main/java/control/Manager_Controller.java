package control;

// Manager has unique methods
// Manager has methods inherited from Receptionist
// Receptionist has methods inherited from Guest

import boundary.Manager_UI;
import entity.SingletonDatabase;


public class Manager_Controller {

    private static Manager_UI showManagerMenu;
    
    // constructor for boundary
    public Manager_Controller() {
        showManagerMenu = new Manager_UI();
        showManagerMenu.displayGUI();
    }

}
