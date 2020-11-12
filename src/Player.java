

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

    public int tossSticks() {
        double gen = Math.random() * 16;
        if (gen < 4) {
            return 1;
        }
        else if (gen < 10) {
            return 2;
        }
        else if (gen < 14) {
            return 3;
        }
        else if (gen < 15) {
            return 4;
        }
        else if (gen < 16) {
            return 6;
        }
        else {
            return 0;
        }
    }
}
