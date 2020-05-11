package solutions;

/**
 * SUPPLEMENTARY TO FUELDEPOT.JAVA (see that for full question)
 */

public interface FuelRobot {

    int getCurrentIndex();

    boolean isFacingRight();

    void changeDirection();
    
    void moveForward(int numLocs);
}