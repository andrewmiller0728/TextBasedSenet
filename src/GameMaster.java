import java.util.Scanner;

/**
 * Runs the mechanics of the game
 * Responsible for starting the game, running each turn, and ending the game
 */
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

        System.out.printf("%s, you're the white player. Your first move is %d spaces\n",
                                         whitePlayer.getName(),
                                         whitePlayer.getCurrThrow());
        System.out.printf("%s, you're the black player.\n",
                                         blackPlayer.getName());

        System.out.println(board.getVisualBoard());

        Scanner in = new Scanner(System.in);
        System.out.printf("%s, you threw a %d with the sticks, which pawn would you like to move? (0-4)\n",
                          currPlayer.getName(),
                          currPlayer.getCurrThrow());
        int playerAns = in.nextInt();
        Cell startCell = board.getCell(currPlayer.getPawns().get(playerAns));
        board.movePawn(startCell.getID(), currPlayer.getCurrThrow());
    }

    public void nextTurn() {
        // Change players if previous player doesn't get another turn
        if (currPlayer.isCurrThrow2or3()) {
            if (currPlayer.equals(playerA)) {
                currPlayer = playerB;
            }
            else {
                currPlayer = playerA;
            }
        }

        currPlayer.tossSticks();

        System.out.println(board.getVisualBoard());

        Scanner in = new Scanner(System.in);
        System.out.printf("%s, you threw a %d with the sticks, which pawn would you like to move? (0-4)\n",
                          currPlayer.getName(),
                          currPlayer.getCurrThrow());
        int playerAns = in.nextInt();
        Cell startCell = board.getCell(currPlayer.getPawns().get(playerAns));
        board.movePawn(startCell.getID(), currPlayer.getCurrThrow());
    }

    private Player getFirstPlayer() {
        do {
            playerA.tossSticks();
            playerB.tossSticks();
        } while (playerA.isCurrThrow2or3() == playerB.isCurrThrow2or3());

        if (playerA.isCurrThrow2or3()) {
            return playerA;
        }
        else if (playerB.isCurrThrow2or3()) {
            return playerB;
        }
        else {
            return null;
        }
    }

}
