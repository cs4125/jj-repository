package control;

// Manager has unique methods
// Manager has methods inherited from Receptionist
// Receptionist has methods inherited from Guest

import boundary.GUI_Manager;
import entity.SingletonDatabase;


public class Control_Manager{

    private static GUI_Manager showManagerMenu;
    
    // constructor for boundary
    public Control_Manager() {
        showManagerMenu = new GUI_Manager();
        showManagerMenu.displayGUI();
    }

    // constructor for entity
    public Control_Manager(String action, String menuInput) {
        if (action.equals("deleteUser")) {
            SingletonDatabase deletion = new SingletonDatabase(action, menuInput);
        }
    }

}
