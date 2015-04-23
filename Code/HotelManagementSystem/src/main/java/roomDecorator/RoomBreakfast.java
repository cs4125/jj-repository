package roomDecorator;

/**
 * Created by Ross on 05/04/2015.
 */
public class RoomBreakfast extends RoomDecorator
{
    public RoomBreakfast(I_Room i_room) {
        super(i_room);
    }

    public String getDescription()
    {
        return tempI_room.getDescription() + ", Including Breakfast.";
    }

    public double getCost()
    {
        return tempI_room.getCost() + 15.00;
    }

    @Override
    public int getNumber() {
        return tempI_room.getNumber();
    }
}
