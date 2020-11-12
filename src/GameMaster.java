

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
        return null;
    }

}
