package reservationState;

import reservationState.Reservation;
import reservationState.ReservationStatus;
import reservationState.ReservationStatusOperations;

/**
 * Created by Ross on 11/04/2015.
 */
public class CancelledRso implements ReservationStatusOperations {
    @Override
    public ReservationStatus accept(Reservation reservation) {
        System.out.println("Error Reservation cancelled");
        return null;
    }

    @Override
    public ReservationStatus charge(Reservation reservation) {
        System.out.println("Error you cannot charge a cancelled reservation");
        return null;
    }

    @Override
    public ReservationStatus cancel(Reservation reservation) {
        System.out.println("Room already cancelled! ");
        return null;
    }
}
