package entity;

/**
 * Created by Ross on 24/03/2015.
 */
public abstract class User {

    private String username;
    private String password;
    private String userType;

    public User(String username, String password, String userType)
    {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
