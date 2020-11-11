

public class Main {

    private static Board gameboard;

    public static void main(String[] args) {
        gameboard = new Board();
        System.out.println(gameboard.toString());

        printCells();
        System.out.println();
        gameboard.movePawn(9, 11);
        gameboard.movePawn(8, 9);
        gameboard.movePawn(7, 13);
        printCells();
        System.out.println();

    }

    private static void printCells() {
        for (int i = 0; i < 30; i++) {
            Cell currCell = gameboard.getCell(i);
            Pawn currPawn = currCell.getPawn();
            String output;
            if (currPawn != null) {
                output = String.format("%s Cell %d: %s Pawn", currCell.getType(), currCell.getID(), currPawn.getType());
            }
            else {
                output = String.format("%s Cell %d: %s Pawn", currCell.getType(), currCell.getID(), "no");
            }
            System.out.println(output);
        }
    }

}
