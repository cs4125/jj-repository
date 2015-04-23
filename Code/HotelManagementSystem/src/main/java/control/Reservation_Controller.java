package control;

import roomDecorator.Room;
import entity.SingletonDatabase;
import reservationState.ReservationStatus;

import javax.swing.*;
import java.util.GregorianCalendar;

public class Reservation_Controller {

    int roomNumber;
    Room room;

    public Reservation_Controller(int roomNumber)
    {
        this.roomNumber = roomNumber;
        room = SingletonDatabase.getInstance().searchRooms(roomNumber);

    }

    public Reservation_Controller()
    {

    }

    public void reserveRoom()
    {
        room.getReservation().accept();
        if(room.getReservation().getStatus() == ReservationStatus.NEW)
        {
            int i = (int)Math.random()*100000+1;
            JOptionPane.showMessageDialog(null, "Reserving room: " + room.getNumber(), "Reservation Accepted", JOptionPane.INFORMATION_MESSAGE);
            room.getReservation().accept();
            room.getReservation().setPrice(room.getCost());
            room.getReservation().setName(Login_Controller.getUser().getUsername());
            room.getReservation().setId(i);
            room.getReservation().setDate(new GregorianCalendar().getTime());

            JOptionPane.showMessageDialog(null, "Reservation ID: " + room.getReservation().getId() + "\nReservation Date: " + room.getReservation().getDate() + "\nName: " + room.getReservation().getName() + "\nroomDecorator & Cost: " + room.getRoomNumber() + " " + room.getReservation().getPrice(), "Reservation Details", JOptionPane.INFORMATION_MESSAGE);
            // make payment

        }
//        else
//            JOptionPane.showMessageDialog(null, "Error: room unavailable!", "room Details", JOptionPane.ERROR_MESSAGE);
    }

    public void cancelReservation()
    {

            JOptionPane.showMessageDialog(null, "Cancelling Reservation on room: " + room.getNumber(), "Reservation Cancelled", JOptionPane.INFORMATION_MESSAGE);
            room.getReservation().cancel();

//        else
//            JOptionPane.showMessageDialog(null, "Error: room unavailable!", "room Details", JOptionPane.ERROR_MESSAGE);
    }

    public void refreshReservation()
    {

            JOptionPane.showMessageDialog(null, "Renewing Reservation on room: " + room.getNumber(), "Reservation status changed to available", JOptionPane.INFORMATION_MESSAGE);
            room.getReservation().setStatus(ReservationStatus.NEW);

//        else
//            JOptionPane.showMessageDialog(null, "Error: room unavailable!", "room Details", JOptionPane.ERROR_MESSAGE);
    }


}
