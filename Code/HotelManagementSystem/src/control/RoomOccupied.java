package control;

/**
 * Created by Ross on 04/04/2015.
 */
public class RoomOccupied implements I_RoomState {

    I_RoomState roomState;

    public RoomOccupied(I_RoomState newRoomState)
    {
        roomState = newRoomState;
    }

    @Override
    public boolean isAvailable()
    {
        return false;
    }

    @Override
    public boolean isOccupied() { return true; }
}
