package control;

/**
 * Created by Ross on 05/04/2015.
 */
public abstract class RoomDecorator implements I_Room
{
    protected I_Room tempI_room;

    public RoomDecorator(I_Room i_room)
    {
        tempI_room = i_room;
    }

    public String getDescription()
    {
        return tempI_room.getDescription();
    }

    public double getCost()
    {
        return tempI_room.getCost();
    }
}
