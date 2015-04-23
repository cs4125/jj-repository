package entity;

import roomDecorator.Room;
import roomDecorator.I_Room;
import reservationState.Reservation;
import reservationState.ReservationStatus;
import userFactory.Guest;
import userFactory.Manager;
import userFactory.Receptionist;
import userFactory.User;

import java.util.ArrayList;

/**
 * Created by Ross on 24/03/2015.
 */
public class SingletonDatabase {

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

        rooms.add(new Room("Special1", "All Included", 1, 20, new Reservation()));
        rooms.add(new Room("Special2", "Kingsize", 5, 20, new Reservation()));
        rooms.add(new Room("Special3", "Queensize", 6, 20, new Reservation()));
        rooms.add(new Room("Special4", "Single", 7, 20, new Reservation()));

        for(int i = 0; i < rooms.size(); i++) {
            rooms.get(i).getReservation().setStatus(ReservationStatus.NEW);
        }

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


    public ArrayList<I_Room> getI_Rooms() {
        return i_rooms;
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
