package entity;

import control.I_Room;
import control.RoomDecorator;

/**
 * Created by Ross on 05/04/2015.
 */
public class RoomMinibar extends RoomDecorator
{
    // must explicitly call super
    public RoomMinibar(I_Room i_room) {
        super(i_room);
    }

    @Override
    public String getDescription()
    {
        return tempI_room.getDescription() + ", Including Minibar";
    }

    @Override
    public double getCost()
    {
        return tempI_room.getCost() + 50.00;
    }

    @Override
    public int getNumber() {
        return tempI_room.getNumber();
    }
}
