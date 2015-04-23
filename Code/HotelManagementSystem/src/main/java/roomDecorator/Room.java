package roomDecorator;

import reservationState.*;

/**
 * Created by Ross on 24/03/2015.
 */
public class Room implements I_Room
{
    private String roomType;
    private String description;
    private int roomNumber;
    private double roomCost;
    private Reservation reservation;

    // every instance of roomDecorator will have a reservation which with have a state
    // this should allow us to dynamically change the state of the roomDecorator

    // constructor
    public Room(String roomType, String description, int roomNumber, double roomCost, Reservation reservation)
    {
        this.roomType = roomType;
        this.description = description;
        this.roomNumber = roomNumber;
        this.roomCost = roomCost;
        this.reservation = reservation;
        this.reservation.setStatus(ReservationStatus.NEW);
    }

    public Reservation getReservation()
    {
        return reservation;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomCost(double roomCost) {
        this.roomCost = roomCost;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return roomCost + 65.00;
    }

    @Override
    public int getNumber() {
        return roomNumber;
    }

}
