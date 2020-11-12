

public class GameMaster {

    private final Board board;
    private final Player playerA;
    private final Player playerB;

    public GameMaster() {
        this.board = null;
        this.playerA = null;
        this.playerB = null;
    }

    public GameMaster(Board board, Player playerA, Player playerB) {
        this.board = board;
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void runGame() {
        Player whitePlayer, blackPlayer;
        if (this.getFirstPlayer().equals(playerA)) {
            whitePlayer = playerA;
            blackPlayer = playerB;
        }
        else if (this.getFirstPlayer().equals(playerB)) {
            whitePlayer = playerB;
            blackPlayer = playerA;
        }
        else {

        }
    }

    private Player getFirstPlayer() {
        if (playerA != null && playerB != null) {
            do {
                playerA.tossSticks();
                playerB.tossSticks();
            } while ((playerA.getCurrThrow() == 1) == (playerB.getCurrThrow() == 1));

            if (playerA.getCurrThrow() == 1) {
                return playerA;
            }
            else if (playerB.getCurrThrow() == 1) {
                return playerB;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }

}
