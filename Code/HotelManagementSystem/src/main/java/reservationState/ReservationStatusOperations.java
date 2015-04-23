package reservationState;

/**
 * Created by Ross on 11/04/2015.
 */

/**
 *  interface for all business methods
 */
public interface ReservationStatusOperations {

    ReservationStatus accept(Reservation reservation);

    ReservationStatus charge(Reservation reservation);

    ReservationStatus cancel(Reservation reservation);

}
