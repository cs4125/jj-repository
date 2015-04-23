package roomDecorator;

/**
 * Created by Ross on 05/04/2015.
 */
public class RoomWifi extends RoomDecorator
{
    public RoomWifi(I_Room i_room) {
        super(i_room);
    }

    @Override
    public String getDescription()
    {
        return tempI_room.getDescription() + ", Including wifi";
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
