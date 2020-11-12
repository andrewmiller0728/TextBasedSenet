
public class Pawn {

    private PawnType type;
    private int ID;
    private Cell cell;

    public Pawn(PawnType type, int ID) {
        this.type = type;
        this.ID = ID;
        this.cell = null;
    }

    public Pawn(PawnType type, int ID, Cell cell) {
        this.type = type;
        this.ID = ID;
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public PawnType getType() {
        return type;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "type=" + type +
                ", ID=" + ID +
                '}';
    }

}
