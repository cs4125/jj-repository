package roomDecorator;

import entity.SingletonDatabase;
import reservationState.ReservationStatus;

import java.util.ArrayList;

public class Room_Controller {

    ArrayList<Room> rooms = SingletonDatabase.getInstance().getRooms();

    public Room_Controller()
    {

    }

    public String displayAllRooms()
    {
        String roomDetails = "List of All Rooms: \n";
        for(Room room : rooms)
        {
            roomDetails += "Room Number: " + room.getNumber() + " Room Type: " + room.getDescription() + " Cost: " + room.getCost() + "\n";
        }
        return roomDetails;
    }

    public String displayOccupiedRooms()
    {
        String roomDetails = "List of Occupied Rooms: \n";
        for(Room room : rooms)
        {
            if(room.getReservation().getStatus() == ReservationStatus.ACCEPTED)
            {
                roomDetails += "Room Number: " + room.getNumber() + " roomDecorator Type: " + room.getDescription() + " Cost: " + room.getCost() + "\n";
            }
        }
        return roomDetails;
    }

    public String displayAvailableRooms()
    {
        String roomDetails = "List of Available Rooms: \n";
        for(Room room : rooms)
        {
            if(room.getReservation().getStatus() == ReservationStatus.NEW)
            {
                roomDetails += "Room Number: " + room.getNumber() + " Room Type: " + room.getDescription() + " Cost: " + room.getCost() + "\n";
            }
        }
        return roomDetails;
    }


    public String displayCancelledRooms()
    {
        String roomDetails = "List of Cancelled Rooms: \n";
        for(Room room : rooms)
        {
            if(room.getReservation().getStatus() == ReservationStatus.CANCELLED)
            {
                roomDetails += "Room Number: " + room.getNumber() + " Room Type: " + room.getDescription() + " Cost: " + room.getCost() + "\n";
            }
        }
        return roomDetails;
    }
}
