package control;

import entity.Room;
import entity.SingletonDatabase;

import javax.swing.*;
import java.util.ArrayList;

public class Control_Room {

    ArrayList<Room> rooms = SingletonDatabase.getInstance().getRooms();

    public Control_Room()
    {

    }

    public String displayAvailableRooms()
    {
        String roomDetails = "List of Available Rooms: \n";
        for(Room room : rooms)
        {
            if(room.getIsAvailable().isAvailable())
            {
                roomDetails += "Room Number: " + room.getRoomNumber() + " Room Type: " + room.getRoomType() + " Cost: " + room.getCost() + "\n";
            }
        }
        return roomDetails;
    }
    private void makeReservation() {
        JOptionPane.showMessageDialog(null, "All : makeReservation", null, 1);
    }

    private void editReservation() {
        JOptionPane.showMessageDialog(null, "All : editReservation", null, 1);
    }

    private void deleteReservation() {
        JOptionPane.showMessageDialog(null, "All : deleteReservation", null, 1);
    }

}
