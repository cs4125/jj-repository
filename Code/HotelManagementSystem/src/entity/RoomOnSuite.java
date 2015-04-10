package entity;

import control.I_Room;
import control.RoomDecorator;

/**
 * Created by Ross on 05/04/2015.
 */
public class RoomOnSuite extends RoomDecorator {

    public RoomOnSuite(I_Room i_room) {
        super(i_room);
    }

    @Override
    public String getDescription()
    {
        return tempI_room.getDescription() + ", On-Suite";
    }

    @Override
    public double getCost()
    {
        return tempI_room.getCost() + 10.00;
    }

    @Override
    public int getNumber() {
        return tempI_room.getNumber();
    }

}
