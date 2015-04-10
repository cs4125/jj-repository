package control;

/**
 * Created by Ross on 04/04/2015.
 */
public class RoomAvailable implements I_RoomState {

    I_RoomState roomState;

    public RoomAvailable(I_RoomState newRoomState)
    {
        roomState = newRoomState;
    }

    @Override
    public boolean isAvailable() { return true; }

    @Override
    public boolean isOccupied()
    {
        return false;
    }
}
