package entity;

import control.I_Room;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ross on 24/03/2015.
 */
public class SingletonDatabase {

    private String menuInput;
    private String action;

    private static SingletonDatabase instance;

    // need to find a way to use these concurrently without changing the structure of the patterns
    private static ArrayList<Room> rooms = new ArrayList<Room>(); // state pattern // not working correctly...
    private static ArrayList<I_Room> i_rooms = new ArrayList<I_Room>(); // decorator pattern
    private static ArrayList<User> registeredUsers = new ArrayList<User>();

    // declared private constructor
    private SingletonDatabase()
    {
        registeredUsers.add(new Manager("jim", "123", "Manager"));
        registeredUsers.add(new Receptionist("pat", "456", "Receptionist"));
        registeredUsers.add(new Guest("joe", "789", "Guest", "123456","limerick", "(087)789654"));

        i_rooms.add(new RoomWifi(new RoomBreakfast(new RoomKingSize(new RoomMinibar(new RoomOnSuite(new Room("Special", "All Included", 100, 20)))))));
        i_rooms.add(new RoomWifi(new RoomKingSize(new RoomMinibar(new Room("Special", "Special Offer", 99, 20)))));
        i_rooms.add(new RoomKingSize(new RoomWifi(new RoomBreakfast(new Room("Special", "Special for two", 98, 20)))));
        i_rooms.add(new RoomBreakfast(new RoomKingSize(new RoomMinibar(new RoomOnSuite(new Room("Special", "Special Offer", 97, 15))))));
    }

    // access to the static database
    public static SingletonDatabase getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonDatabase();
        }
        return instance;
    }

    //??
    public SingletonDatabase(String action, String menuInput) {
        this.action = action;
        this.menuInput = menuInput;
        setMenuSelection();
    }

    private void setMenuSelection() {
        if(action.equals("deleteUser")) {
            // TODO
            JOptionPane.showMessageDialog(null, "TODO - Delete User", null, 2);
        }
    }

    public User searchUsers(String username)
    {
        for(int i = 0; i < registeredUsers.size(); i++)
        {
            if(registeredUsers.get(i).getUsername().equals(username))
            {
                return registeredUsers.get(i);
            }
        }
        return null;
    }

    public I_Room searchI_Rooms(int roomNumber)
    {
        for(int i = 0; i < i_rooms.size(); i++)
        {
            if(i_rooms.get(i).getNumber() == (roomNumber))
            {
                return i_rooms.get(i);
            }
        }
        return null;
    }

    public Room searchRooms(int roomNumber)
    {
        for(int i = 0; i < rooms.size(); i++)
        {
            if(rooms.get(i).getNumber() == (roomNumber))
            {
                return rooms.get(i);
            }
        }
        return null;
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(ArrayList<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
}
