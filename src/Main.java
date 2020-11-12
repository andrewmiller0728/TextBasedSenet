

public class Main {

    private static Board board;

    public static void main(String[] args) {
        board = new Board();

        board.movePawn(9, board.tossSticks());
        printVisualBoard();

        board.movePawn(8, board.tossSticks());
        printVisualBoard();

        board.movePawn(7, board.tossSticks());
        printVisualBoard();

        board.movePawn(6, board.tossSticks());
        printVisualBoard();
    }

    private static void printVisualBoard() {
        String output1 = "       |";
        String output2 = "Board: |";

        for (int i = 0; i < 30; i++) {
            output1 = output1.concat(String.format(" %02d|", i));

            Cell currCell = board.getCell(i);
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
