package reservationState;

import reservationState.Reservation;
import reservationState.ReservationStatus;
import reservationState.ReservationStatusOperations;

/**
 * Created by Ross on 11/04/2015.
 */
public class AcceptedRso implements ReservationStatusOperations {
    @Override

    public ReservationStatus accept(Reservation reservation) {

        System.out.println("Reservation already accepted!");
        return null;
    }



    @Override

    public ReservationStatus charge(Reservation reservation) {

        //charge client's credit card

        //send e-mail

        //print ticket

        return ReservationStatus.PAID;

    }

    @Override

    public ReservationStatus cancel(Reservation reservation) {

        //send cancellation e-mail

        return ReservationStatus.CANCELLED;

    }
}
