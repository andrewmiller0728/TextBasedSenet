
public class Pawn {

    private PawnType type;
    private int ID;

    public Pawn() {
        this.type = null;
        this.ID = -1;
    }

    public Pawn(PawnType type, int ID) {
        this.type = type;
        this.ID = ID;
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
