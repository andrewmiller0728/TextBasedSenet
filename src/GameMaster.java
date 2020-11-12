

public class GameMaster {

    private Board board;
    private Player player1, player2;

    public GameMaster() {
        this.board = null;
        this.player1 = null;
        this.player2 = null;
    }

    public GameMaster(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getFirstPlayer() {
        int toss1, toss2;
        do {
            toss1 = player1.tossSticks();
            toss2 = player2.tossSticks();
        } while (!(toss1 == 2 || toss1 == 3) && !(toss2 == 2 || toss2 == 3));

        return null;
    }

}
