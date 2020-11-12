

public class Main {

    private static Board board;
    private static Player playerA, playerB;
    private static GameMaster gm;

    public static void main(String[] args) {
        board = new Board();
        playerA = new Player("Andrew");
        playerB = new Player("Charlotte");
        gm = new GameMaster(board, playerA, playerB);

        System.out.println("Welcome to Andrew's Senet Game!\n");
        gm.startGame();
        for (int i = 0; i < 5; i++) {
            gm.nextTurn();
        }
    }

}
