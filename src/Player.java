
/**
 * Stores data about a player
 */
public class Player {

    private String name;
    private PawnList pawns;
    private int currThrow;
    // TODO: score

    public Player(String name) {
        this.name = name;
        this.pawns = null;
        this.currThrow = 0;
    }

    public Player(String name, PawnList pawns) {
        this.name = name;
        this.pawns = pawns;
        this.currThrow = 0;
    }

    public boolean isCurrThrow2or3() {
        return this.getCurrThrow() == 2 || this.getCurrThrow() == 3;
    }

    public String getName() {
        return name;
    }

    public PawnList getPawns() {
        return pawns;
    }

    public int getCurrThrow() {
        return currThrow;
    }

    public void setPawns(PawnList pawns) {
        this.pawns = pawns;
    }

    public int tossSticks() {
        double gen = Math.random() * 16;
        if (gen < 4) {
            this.currThrow = 1;
        }
        else if (gen < 10) {
            this.currThrow = 2;
        }
        else if (gen < 14) {
            this.currThrow = 3;
        }
        else if (gen < 15) {
            this.currThrow = 4;
        }
        else if (gen < 16) {
            this.currThrow = 6;
        }
        else {
            this.currThrow = 0;
        }
        return this.currThrow;
    }
}
