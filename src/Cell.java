
public class Cell {

    private CellType type;
    private int ID;
    private Pawn pawn;

    public Cell() {
        this.type = CellType.DEFAULT;
        this.ID = -1;
        this.pawn = null;
    }

    public Cell(CellType type, int id) {
        this.type = type;
        this.ID = id;
        this.pawn = null;
    }

    public Cell(CellType type, int id, Pawn pawn) {
        this.type = type;
        this.ID = id;
        this.pawn = pawn;
    }

    public CellType getType() {
        return type;
    }

    public int getID() {
        return ID;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }
}