package questions;

/**
 * STAND ALONE CLASS
 */

public class GameSpinner {

    //you'll be writing the whole class

    /**
     * This question involves the creation and use of a spinner to generate random numbers in a game. 
     * A GameSpinner object represents a spinner with a given number of sectors, all equal in size. 
     * The GameSpinner class supports the following behaviors:
     * 
     * Creating a new spinner with the specified number of sectors
     * Spinning the spinner and returning the result
     * Reporting the length of the current run which is the number of consecutive spins that are the same as the
     * most recent spin
     * 
     * here is what some code that uses the class might look like: 
     * 
     * 
     * GameSpinner g = new GameSpinner(4); //created a new GameSpinner with 4 sectors
     * g.currentRun(); //returns 0 because no spins have occured yet
     * g.spin(); //returns a random number between 1 and 4 inclusive; in this case, returns 3
     * g.currentRun(); //length of the current run is 1 because there has been one spin of 3 so far
     * g.spin(); //Returns a random integer between 1 and 4, inclusive. In this case, 3 is returned
     * g.currentRun(); //The length of the current run is 2 because there have been two 3s in a row
     * g.spin(); //Returns a random integer between 1 and 4, inclusive. In this case, 4 is returned
     * g.currentRun(); //The length of the current run is 1 because the spin of 4 is different from 
     * the value of the spin in the previous run of two 3s.
     * g.spin(); //returns a random number between 1 and 4 inclusive; in this case, returns 3
     * g.currentRun(); //The length of the current run is 1 because the spin of 4 is different from 
     * the value of the spin in the previous run of two 3s.
     */
    
}