package entity;

import java.util.ArrayList;

public class DataBase {

    private ArrayList<String> registeredUsers = new ArrayList();

    private DataBase() {

    }

    public DataBase(String username) {
        registeredUsers.add("jim");     // username
        registeredUsers.add("123");     // password
        registeredUsers.add("Manager"); // userType

        registeredUsers.add("pat");
        registeredUsers.add("456");
        registeredUsers.add("Receptionist");

        registeredUsers.add("joe");
        registeredUsers.add("789");
        registeredUsers.add("Guest");
    }

    private String searchArrayList(int increment, String username) {
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

}