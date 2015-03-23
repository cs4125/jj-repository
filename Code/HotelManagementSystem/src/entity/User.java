package entity;

import control.Control;

/**
 * Created by Ross on 23/03/2015.
 */
public class User {

    private String username;
    private String password;
    private String userType;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(String username) {
        // goto db and get password for username
        return password;
    }

    public String getUserType() {
        // goto db and get userType for username
        return userType;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBrowseRooms()
    {
        return null;
    }
}
