import java.util.Arrays;

public class PawnList {

    private Pawn[] pawns;
    private int size;
    private int index;

    public PawnList() {
        this.pawns = new Pawn[30];
        this.size = 30;
        this.index = 0;
    }

    public PawnList(int size) {
        this.pawns = new Pawn[size];
        this.size = size;
        this.index = 0;
    }

    public int getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }

    public Pawn get(int i) {
        return pawns[i];
    }

    public void addPawn(Pawn newPawn) {
        if (index <= size) {
            pawns[index] = newPawn;
            index++;
        }
        // TODO: handle attempts to add to full list
    }

    @Override
    public String toString() {
        return "PawnList{" +
                "pawns=" + Arrays.toString(pawns) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
