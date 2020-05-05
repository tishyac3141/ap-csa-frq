package questions;

/**
 * SUPPLEMENTARY WITH SEAT.JAVA
 */

/**
 * A theater contains rows of seats with the same number of seats in each row. 
 * Some rows contain tier 1 seats, and the remaining rows contain tier 2 seats. 
 * Tier 1 seats are closer to the stage and are more desirable. All seats in a row share 
 * the same tier.
 */

public class Theater {
    
    private Seat[][] theaterSeats;

    /**
     *  Write the constructor for the Theater class. The constructor takes three int parameters, 
     * representing the number of seats per row, the number of tier 1 rows, and the number of tier 2 
     * rows, respectively. The constructor initializes the theaterSeats instance variable so that it 
     * has the given number of seats per row and the given number of tier 1 and tier 2 rows and all 
     * seats are available and have the appropriate tier designation.
     * 
     * Row 0 of the theaterSeats array represents the row closest to the stage. 
     * All tier 1 seats are closer to the stage than tier 2 seats
     * 
     * Precondition: seatsPerRow > 0; tier1Rows > 0; tier2Rows >= 0
     */
    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows){
        //your code here
    }

    /**
     * Write the reassignSeat method, which attempts to move a person from a source seat to a destination seat. 
     * The reassignment can be made if the destination seat is available and has the same or greater tier than 
     * the source seat (that is, it is equally or less desirable). For example, a person in a tier 1 seat can 
     * be moved to a different tier 1 seat or to a tier 2 seat, but a person in a tier 2 seat can only be moved 
     * to a different tier 2 seat.
     * 
     * The reassignSeat method has four int parameters representing the row and column indexes of the source (“from”)
     *  and destination (“to”) seats. If the reassignment is possible, the source seat becomes available, the 
     * destination seat becomes unavailable, and the method returns true. If the seat reassignment is not possible, 
     * no changes are made to either seat and the method returns false. Assume that the source seat is occupied when 
     * the method is called.
     * 
     * Complete method reassignSeat.
     * Precondition: fromRow, fromCol, toRow, and toCol represent valid row and column positions in the theater.
     * The seat at 'fromRow, fromCol' is not available
     */
    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol){
        //your code here
        return false;
    }
}