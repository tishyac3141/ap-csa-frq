package solutions;

import java.util.ArrayList;

/**
 * SUPPLEMENTARY WITH NUMBERTILE.JAVA
 */

public class TileGame {

    private ArrayList<NumberTile> board;

    public TileGame(){
        board = new ArrayList<NumberTile>();
    }

    private int getIndexForFit(NumberTile tile){
        int tileLeft = tile.getLeft();
        int tileRight = tile.getRight();

        int left;
        int right;

        int index = -1;

        if(board.size() == 0) return 0;
        else if(board.get(0).getLeft() == tileRight) return 0;
        else if(board.get(board.size() - 1).getRight() == tileLeft) return board.size();
        
        for(int i = 1; i < board.size(); i++){
            left = board.get(i - 1).getLeft();
            right = board.get(i).getRight();
            
            if(tileLeft == left && tileRight == right) index = i;
        }
        return index;
    }

    public boolean insertTile(NumberTile tile){
        int index = 0;
        int counter = 0;

        if(board.size() == 0){
            board.add(tile);
            return true;
        }

        while(counter < 4 && index < 0){
            tile.rotate();
            counter++;
            index = getIndexForFit(tile);
        }

        if(index < 0){
            board.add(index, tile);
            return true;
        } else{
            return false;
        }

    }
    
}