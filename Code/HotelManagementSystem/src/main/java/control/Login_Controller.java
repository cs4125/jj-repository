package control;

import boundary.Login_UI;
import entity.*;
import userFactory.Guest;
import userFactory.Manager;
import userFactory.Receptionist;
import userFactory.User;

public class Login_Controller {
    
    private String username, password;
    // Database static object so it stays persistent throughout the program lifespan
    public static SingletonDatabase singletonDatabase = SingletonDatabase.getInstance();
    private static User user;

    Login_UI gui_login = new Login_UI();

    // constructor for boundary.GUI_Login_Register
    public Login_Controller()
    {
        gui_login.displayGUI();
    }

    // constructor for boundary.GUI_Login_Register
    public Login_Controller(String username, String password)
    {
        this.username = username;
        this.password = password;

    }

    // login method
    public void login() {

        // create user and search in database
        user = singletonDatabase.searchUsers(username);

        if(user != null) {

            // get the password of the found user
            String dbPassword = user.getPassword();

            // successful recovery
            if (dbPassword != null && dbPassword.equals(password)) {

                    if (user instanceof Guest) {
                        Guest_Controller guestUseCases = new Guest_Controller((Guest)user);

                    } else if (user instanceof Receptionist) {
                        Receptionist_Controller receptionistUseCases
                                = new Receptionist_Controller((Receptionist)user);

                    } else if (user instanceof Manager) {
                        Manager_Controller managerUseCases
                                = new Manager_Controller();
                    }
                }
            }
        // user does not exist
        else
        {
            Login_UI gui_login = new Login_UI(username, password);
            gui_login.displayGUI();
        }
    }

    public static User getUser()
    {
        return user;
    }

}
