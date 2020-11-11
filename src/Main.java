

public class Main {

    public static void main(String[] args) {
        Board gameboard = new Board();
        System.out.println(gameboard.toString());

        for (int i = 0; i < 30; i++) {
            Cell currCell = gameboard.getCell(i);
            Pawn currPawn = currCell.getPawn();
            String output = "NONE";
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
