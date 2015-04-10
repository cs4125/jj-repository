package control;

import boundary.GUI_Login;
import entity.*;

public class Control_Login {
    
    private String username, password;
    // Database static object so it stays persistent throughout the program lifespan
    public static SingletonDatabase singletonDatabase = SingletonDatabase.getInstance();

    // constructor for boundary.GUI_Login_Register
    public Control_Login()
    {
        GUI_Login gui_login = new GUI_Login();
        gui_login.displayGUI();
    }

    // constructor for boundary.GUI_Login_Register
    public Control_Login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    // login method
    public void login() {

        // create user and search in database
        User user = singletonDatabase.searchUsers(username);

        if(user != null) {

            // get the password of the found user
            String dbPassword = user.getPassword();

            // successful recovery
            if (dbPassword != null && dbPassword.equals(password)) {

                    // create appropriate object
                    if (user instanceof Guest) {
                        Control_Guest guestUseCases
                                = new Control_Guest((Guest)user);

                    } else if (user instanceof Receptionist) {
                        Control_Receptionist receptionistUseCases
                                = new Control_Receptionist(user);

                    } else if (user instanceof Manager) {
                        Control_Manager managerUseCases
                                = new Control_Manager();
                    }
                }
            }
        // user does not exist
        else
        {
            GUI_Login gui_login = new GUI_Login(username, password);
            gui_login.displayGUI();
        }
    }

}
