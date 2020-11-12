

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
                Cell newCell = new Cell(CellType.DEFAULT, i);
                Pawn newPawn;
                if (i % 2 == 0) {
                    newPawn = new Pawn(PawnType.BLACK, blackPawns.getIndex(), newCell);
                    blackPawns.addPawn(newPawn);
                }
                else {
                    newPawn = new Pawn(PawnType.WHITE, whitePawns.getIndex(), newCell);
                    whitePawns.addPawn(newPawn);
                }
                newCell.setPawn(newPawn);
                cells.addCell(newCell);
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

    public int tossSticks() {
        double gen = Math.random() * 16;
        if (gen < 4) {
            return 1;
        }
        else if (gen < 10) {
            return 2;
        }
        else if (gen < 14) {
            return 3;
        }
        else if (gen < 15) {
            return 4;
        }
        else if (gen < 16) {
            return 6;
        }
        else {
            return 0;
        }
    }

    public void movePawn(int x, int dx) {
        Cell cellA = cells.get(x);
        Pawn pawnA = cellA.getPawn();
        Cell cellB = cells.get(x + dx);
        Pawn pawnB = cellB.getPawn();

        if (pawnB == null) {
            cellA.setPawn(null);
            pawnA.setCell(cellB);
            cellB.setPawn(pawnA);
        }
        else {
            cellA.setPawn(pawnB);
            pawnA.setCell(cellB);
            cellB.setPawn(pawnA);
            pawnB.setCell(cellA);
        }
    }

    public Cell getCell(int i) {
        return cells.get(i);
    }

    public Cell getCell(Pawn pawn) {
        for (int i = 0; i < cells.getIndex(); i++) {
            if (cells.get(i).getPawn() != null && cells.get(i).getPawn().equals(pawn)) {
                return cells.get(i);
            }
        }
        return null;
    }

    public void removePawn(Pawn pawn) {
        // TODO: Adjust data structure to remove pawns and have the pawns know where they are
        this.getCell(pawn).setPawn(null);
    }

    public PawnList getWhitePawns() {
        return whitePawns;
    }

    public PawnList getBlackPawns() {
        return blackPawns;
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
