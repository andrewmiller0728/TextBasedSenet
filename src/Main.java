

public class Main {

    private static Board gameboard;

    public static void main(String[] args) {
        gameboard = new Board();

        gameboard.movePawn(9, gameboard.tossSticks());
        printVisualBoard();

        gameboard.movePawn(8, gameboard.tossSticks());
        printVisualBoard();

        gameboard.movePawn(7, gameboard.tossSticks());
        printVisualBoard();

        gameboard.movePawn(6, gameboard.tossSticks());
        printVisualBoard();
    }

    private static void printVisualBoard() {
        String output1 = "       |";
        String output2 = "Board: |";

        for (int i = 0; i < 30; i++) {
            output1 = output1.concat(String.format(" %02d|", i));

            Cell currCell = gameboard.getCell(i);
            if (currCell.getPawn() == null) {
                output2 = output2.concat("---|");
            }
            else if (currCell.getPawn().getType() == PawnType.BLACK) {
                output2 = output2.concat("-X-|");
            }
            else if (currCell.getPawn().getType() == PawnType.WHITE) {
                output2 = output2.concat("-O-|");
            }
            else {
                output2 = output2.concat("-?-|");
            }
        }

        System.out.println(output1 + "\n" + output2 + "\n");

    }

}
