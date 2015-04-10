package control;

import boundary.GUI_Reservation;
import entity.Room;
import entity.SingletonDatabase;

import javax.swing.*;
import java.util.ArrayList;

public class Control_Reservation {

    ArrayList<Room> rooms = SingletonDatabase.getInstance().getRooms();
    I_RoomState roomState;
    int roomNumber;
    I_Room interface_rooms;
    Room room;

    public Control_Reservation(int roomNumber)
    {
        this.roomNumber = roomNumber;
        room = SingletonDatabase.getInstance().searchRooms(roomNumber);
        reserveRoom();
        GUI_Reservation gui_reservation = new GUI_Reservation();
        gui_reservation.displayGUI();
    }

    public void reserveRoom()
    {
        // could have issues here with state design
        if(room.getIsAvailable().isAvailable())
        {
            JOptionPane.showMessageDialog(null, "Showing room: " + interface_rooms.getNumber(), "Room Details", JOptionPane.INFORMATION_MESSAGE);

            roomState = new RoomOccupied(room.getRoomState());
            room.setIsOccupied(roomState);
        }
        else
            JOptionPane.showMessageDialog(null, "Error: Room unavailable!", "Room Details", JOptionPane.ERROR_MESSAGE);
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
