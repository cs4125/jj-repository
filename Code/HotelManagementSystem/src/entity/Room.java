package entity;

import control.I_Room;
import control.I_RoomState;
import control.RoomAvailable;
import control.RoomOccupied;

/**
 * Created by Ross on 24/03/2015.
 */
public class Room implements I_Room
{
    private String roomType;
    private String description;
    private int roomNumber;
    private double roomCost;

    // every instance of Room will have a room state
    // this should allow us to dynamically change the state of the room
    I_RoomState isAvailable; // aggregation
    I_RoomState isOccupied;
    I_RoomState roomState;

    // constructor
    public Room(String roomType, String description, int roomNumber, double roomCost)
    {
        this.roomType = roomType;
        this.description = description;
        this.roomNumber = roomNumber;
        this.roomCost = roomCost;
        isAvailable = new RoomAvailable(roomState);
        isOccupied = new RoomOccupied(roomState);
        roomState = isOccupied;
    }

    public I_RoomState getRoomState() { return roomState; }

    public void setIsAvailable(I_RoomState newRoomState)
    {
        roomState = newRoomState;
    }

    public void setIsOccupied(I_RoomState newRoomState)
    {
        roomState = newRoomState;
    }

    public I_RoomState getIsAvailable()
    {
        return isAvailable;
    }

    public I_RoomState getIsOccupied()
    {
        return isOccupied;
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
