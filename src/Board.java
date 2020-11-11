

public class Board {


    private CellList cells;
    private PawnList whitePawns;
    private PawnList blackPawns;


    public Board() {

        cells = new CellList();
        whitePawns = new PawnList();
        blackPawns = new PawnList();

        for (int i = 0; i < 30; i++) {

            if (i < 10) {
                Pawn newPawn;
                if (i % 2 == 0) {
                    newPawn = new Pawn(PawnType.BLACK, blackPawns.getIndex());
                    blackPawns.addPawn(newPawn);
                }
                else {
                    newPawn = new Pawn(PawnType.WHITE, whitePawns.getIndex());
                    whitePawns.addPawn(newPawn);
                }
                cells.addCell(new Cell(CellType.DEFAULT, cells.getIndex(), newPawn));
            }
            else if (i == 14) {
                cells.addCell(new Cell(CellType.RESURRECT, cells.getIndex()));
            }
            else if (i == 25 || i == 27 || i == 28) {
                cells.addCell(new Cell(CellType.SAFE, cells.getIndex()));
            }
            else if (i == 26) {
                cells.addCell(new Cell(CellType.TRAP, cells.getIndex()));
            }
            else if (i == 29) {
                cells.addCell(new Cell(CellType.GOAL, cells.getIndex()));
            }
            else {
                cells.addCell(new Cell(CellType.DEFAULT, cells.getIndex()));
            }

        }

    }


    public void movePawn(int a, int b) {
        Cell cellA = cells.get(a);
        Cell cellB = cells.get(b);
        cellB.setPawn(cellA.getPawn());
        cellA.setPawn(null);
    }

    public Cell getCell(int i) {
        return cells.get(i);
    }

    @Override
    public String toString() {
        return "Board{" +
                "cells=" + cells.toString() +
                ", whitePawns=" + whitePawns.toString() +
                ", blackPawns=" + blackPawns.toString() +
                '}';
    }
}
