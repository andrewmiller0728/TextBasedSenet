

public class GameMaster {

    private Board board;
    private Player playerA, playerB, currPlayer;

    public GameMaster(Board board, Player playerA, Player playerB) {
        this.board = board;
        this.playerA = playerA;
        this.playerB = playerB;
        this.currPlayer = null;
    }

    public Board getBoard() {
        return board;
    }

    public void startGame() {
        Player whitePlayer, blackPlayer;
        Player firstPlayer = this.getFirstPlayer();
        if (firstPlayer != null && firstPlayer.equals(playerB)) {
            currPlayer = playerB;
            whitePlayer = playerB;
            playerB.setPawns(board.getWhitePawns());
            blackPlayer = playerA;
            playerA.setPawns(board.getBlackPawns());
        }
        else {
            currPlayer = playerA;
            whitePlayer = playerA;
            playerA.setPawns(board.getWhitePawns());
            blackPlayer = playerB;
            playerB.setPawns(board.getBlackPawns());
        }

        System.out.printf("%s, you're the white player. Your first move is %d spaces%n",
                                         whitePlayer.getName(),
                                         whitePlayer.getCurrThrow());
        System.out.printf("%s, you're the black player.%n",
                                         blackPlayer.getName());
    }

    private Player getFirstPlayer() {
        do {
            playerA.tossSticks();
            playerB.tossSticks();
        } while ((playerA.getCurrThrow() == 2 || playerA.getCurrThrow() == 3) == (playerB.getCurrThrow() == 2 || playerB.getCurrThrow() == 3));

        if (playerA.getCurrThrow() == 2 || playerA.getCurrThrow() == 3) {
            return playerA;
        }
        else if (playerB.getCurrThrow() == 2 || playerB.getCurrThrow() == 3) {
            return playerB;
        }
        else {
            return null;
        }
    }

}
