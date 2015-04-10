package entity;

import control.I_Room;
import control.RoomDecorator;

/**
 * Created by Ross on 04/04/2015.
 */
public class RoomKingSize extends RoomDecorator
{

    public RoomKingSize(I_Room i_room) {
        super(i_room);
    }

    @Override
    public String getDescription()
    {
        return tempI_room.getDescription() + ", King Size Bed.";
    }

    @Override
    public double getCost()
    {
        return tempI_room.getCost() + 20.00;
    }

    @Override
    public int getNumber() {
        return tempI_room.getNumber();
    }
}
