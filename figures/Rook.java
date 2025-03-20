package figures;

import exceptions.InvalidMoveException;

public class Rook extends Figure {

    public Rook(LocationX currentX, int currentY) {
        super(PieceName.ROOK, currentX, currentY);
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // Rook moves horizontally or vertically.
        if(x == currentX || y == currentY) {
            currentX = x;
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for Rook.");
        }
    }
    
    @Override
    public String toString() {
        return "Rook at " + currentX + currentY;
    }
}