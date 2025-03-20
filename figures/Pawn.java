package figures;

import exceptions.InvalidMoveException;

/**
 * Author: Jose Luis Hernandez
 * Description: This class represents a Pawn chess piece.
 * It extends the Figure class and implements movement logic specific to a Pawn.
 */

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