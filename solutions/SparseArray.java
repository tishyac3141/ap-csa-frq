package solutions;

import java.util.ArrayList;
import java.util.List;

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
        int value = 0;
        SparseArrayEntry entry;
        
        for(int i = 0; i < entries.size(); i++){
            entry = entries.get(i);

            if(entry.getRow() == row && entry.getCol() == col){
                value = entry.getValue();
            }
        }

        return value;
    }

    public void removeColumn(int col){
        
        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getCol() == col){
                entries.remove(i);
                i--;
            }
        }
        int row;
        int val;
        int column;
        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getCol() > col){
                row = entries.get(i).getRow();
                val = entries.get(i).getValue();
                column = entries.get(i).getCol() - 1;

                entries.set(i, new SparseArrayEntry(row, column, val));
            }
        }
    }
    
}