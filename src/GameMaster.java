

public class GameMaster {

    private final Board board;
    private final Player playerA;
    private final Player playerB;

    public GameMaster(Board board, Player playerA, Player playerB) {
        this.board = board;
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startGame() {
        Player whitePlayer, blackPlayer;
        Player firstPlayer = this.getFirstPlayer();
        if (firstPlayer != null && firstPlayer.equals(playerB)) {
            whitePlayer = playerB;
            playerB.setPawns(board.getWhitePawns());
            blackPlayer = playerA;
            playerA.setPawns(board.getBlackPawns());
        }
        else {
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
