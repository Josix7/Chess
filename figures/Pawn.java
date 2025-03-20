package figures;

import exceptions.InvalidMoveException;

public class Pawn extends Figure {

    public Pawn(LocationX currentX, int currentY) {
        super(PieceName.PAWN, currentX, currentY);
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // For simplicity, assume a Pawn moves only forward one square.
        if(x == currentX && y == currentY + 1) {
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for Pawn.");
        }
    }
    
    @Override
    public String toString() {
        return "Pawn at " + currentX + currentY;
    }
}