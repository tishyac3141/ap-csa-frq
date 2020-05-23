package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * SUPPLEMENTARY WITH SPARSEARRAYENTRY.JAVA
 */

public class SparseArray {

    private int numRows;
    private int numCols;

    private List<SparseArrayEntry> entries;

    public SparseArray(){
        entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumRows(){
        return numRows;
    }

    public int getNumCols(){
        return numCols;
    }

    public int getValueAt(int row, int col){
        //your code here
        return 0;
    }

    public void removeColumn(int col){
        //your code here
    }
    
}