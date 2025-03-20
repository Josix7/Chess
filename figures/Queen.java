package figures;

import exceptions.InvalidMoveException;

public class Queen extends Rook implements IntBishop {

    public Queen(LocationX currentX, int currentY) {
        super(currentX, currentY);
        // Override piece name to Queen.
        this.pieceName = PieceName.QUEEN;
    }
    
    @Override
    public Boolean moveToBishop(LocationX x, int y) throws InvalidMoveException {
        // Queen diagonal move (like Bishop).
        if (Math.abs(x.ordinal() - currentX.ordinal()) == Math.abs(y - currentY)) {
            currentX = x;
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid diagonal move for Queen.");
        }
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // Queen can move as a Rook (straight) or as a Bishop (diagonally).
        if (x == currentX || y == currentY) {
            return super.moveTo(x, y);
        } else {
            return moveToBishop(x, y);
        }
    }
    
    @Override
    public String toString() {
        return "Queen at " + currentX + currentY;
    }
}