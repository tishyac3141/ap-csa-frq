package solutions;

/**
 * SUPPLEMENTARY WITH SEAT.JAVA
 */

public class Theater {
    private Seat[][] theaterSeats;

    /**
     * part A:
     */
    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows){

        theaterSeats = new Seat[seatsPerRow][seatsPerRow];

        for(int i = 0; i < tier1Rows; i++){
            theaterSeats[0][i] = new Seat(true, 1);
            
        }

        if(seatsPerRow > 1){
            for(int j = 0; j < tier2Rows; j++){
                theaterSeats[1][j] = new Seat(true, 2);
            }
        }
    }

    /**
     * part B:
     */
    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol){
        
        Seat source = theaterSeats[fromRow][fromCol];
        Seat destination = theaterSeats[toRow][toCol];

        if(!source.isAvailable() || destination.getTier() > source.getTier()){
            return false;
        } else {
            theaterSeats[fromRow][fromCol].setAvailability(true);
            theaterSeats[toRow][toCol].setAvailability(false);
            return true;
        }
    }

}