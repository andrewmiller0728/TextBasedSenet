

public class Player {

    private String name;
    private PawnList pawns;

    public Player() {
        this.name = null;
        this.pawns = null;
    }

    public Player(String name) {
        this.name = name;
        this.pawns = null;
    }

    public Player(String name, PawnList pawns) {
        this.name = name;
        this.pawns = pawns;
    }

    public String getName() {
        return name;
    }

    public PawnList getPawns() {
        return pawns;
    }

    public void setPawns(PawnList pawns) {
        this.pawns = pawns;
    }
}
