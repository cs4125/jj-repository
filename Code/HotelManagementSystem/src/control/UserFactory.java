package control;
import entity.*;

/**
 * Created by Ross on 24/03/2015.
 */
public class UserFactory
{
    //Factory class returns a new user of selected type
    User createUser(String username, String password, String userType) {
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("Guest")) {
            return new entity.Guest(username, password, userType);
        }
        else if (userType.equalsIgnoreCase("Manager"))
        {
            return new entity.Manager(username, password, userType);
        }
        else if (userType.equalsIgnoreCase("Receptionist"))
        {
            return new entity.Receptionist(username, password, userType);
        }
        return null;
    }
}
