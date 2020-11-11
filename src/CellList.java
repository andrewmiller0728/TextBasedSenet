import java.util.Arrays;

public class CellList {

    private Cell[] cells;
    private int size;
    private int index;

    public CellList() {
        this.cells = new Cell[30];
        this.size = 30;
        this.index = 0;
    }

    public CellList(int size) {
        this.cells = new Cell[size];
        this.size = size;
        this.index = 0;
    }

    public int getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }

    public Cell get(int i) {
        return cells[i];
    }

    public void addCell(Cell newCell) {
        if (index <= size) {
            cells[index] = newCell;
            index++;
        }
        // TODO: handle attempts to add to full list
    }

    @Override
    public String toString() {
        return "CellList{" +
                "cells=" + Arrays.toString(cells) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
