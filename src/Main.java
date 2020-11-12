

public class Main {

    private static Board gameboard;

    public static void main(String[] args) {
        gameboard = new Board();

        printCells();
        System.out.println();

        gameboard.movePawn(9, gameboard.tossSticks());
        printCells();
        System.out.println();

        gameboard.movePawn(8, gameboard.tossSticks());
        printCells();
        System.out.println();

        gameboard.movePawn(7, gameboard.tossSticks());
        printCells();
        System.out.println();

        gameboard.removePawn(gameboard.getWhitePawns().get(4));
        printCells();
        System.out.println();

        gameboard.removePawn(gameboard.getBlackPawns().get(4));
        printCells();
        System.out.println();
    }

//    private static void printPawns() {
//        // White Pawns
//        PawnList whitepawns = gameboard.getWhitePawns();
//        for (int i = 0; i < whitepawns.getIndex(); i++) {
//            Pawn currPawn = whitepawns.get(i);
//            Cell currCell = gameboard.getCell(currPawn);
//            System.out.println(String.format("White pawn %d: Cell %d", i, currCell.getID()));
//        }
//        // Black Pawns
//        PawnList blackpawns = gameboard.getBlackPawns();
//        for (int i = 0; i < blackpawns.getSize(); i++) {
//            Pawn currPawn = blackpawns.get(i);
//            Cell currCell = gameboard.getCell(currPawn);
//            System.out.println(String.format("Black pawn %d: Cell %d", i, currCell.getID()));
//        }
//    }

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
