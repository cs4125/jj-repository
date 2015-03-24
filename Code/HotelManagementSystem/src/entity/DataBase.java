package entity;

import java.util.ArrayList;

public class DataBase {

    // should be a list of type <User>
    // changed to static so it exists throughout the program
    private static ArrayList<String> registeredUsers = new ArrayList();

    public DataBase() {
        registeredUsers.add("jim");     // username
        registeredUsers.add("123");     // password
        registeredUsers.add("Manager"); // userType

        // new implementation **prob should be passing in a User here??
        addUser("pat", "456", "Receptionist");
        addUser("joe", "789", "Guest");
        
    }

    public String searchArrayList(int increment, String username) {
        // increment 0=username 1=password 2=userType
        if (registeredUsers.contains(username)) {
            for (int i = 0; i < registeredUsers.size(); i += 3) {
                if (registeredUsers.get(i).equals(username))
                    return registeredUsers.get(i+increment);
            }
        }
        return null;
    }

    // DataBase password getter
    public String getPassword(String username) {
        return searchArrayList(1,username);
    }

    // DataBase userType getter
    public String getUserType(String username) {
        return searchArrayList(2,username);
    }

    // we should be passing in USER here not Strings
    public void addUser(String name, String pass, String type)
    {
        registeredUsers.add(name);
        registeredUsers.add(pass);
        registeredUsers.add(type);
    }

    public ArrayList<String> getRegisteredUsers()
    {
        return registeredUsers;
    }

}