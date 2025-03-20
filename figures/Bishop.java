
package figures;

import exceptions.InvalidMoveException;

public class Bishop extends Figure implements IntBishop {

    public Bishop(LocationX currentX, int currentY) {
        super(PieceName.BISHOP, currentX, currentY);
    }
    
    @Override
    public Boolean moveToBishop(LocationX x, int y) throws InvalidMoveException {
        // Bishop moves diagonally.
        if (Math.abs(x.ordinal() - currentX.ordinal()) == Math.abs(y - currentY)) {
            currentX = x;
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid diagonal move for Bishop.");
        }
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // Delegate to bishop move.
        return moveToBishop(x, y);
    }
    
    @Override
    public String toString() {
        return "Bishop at " + currentX + currentY;
    }
}