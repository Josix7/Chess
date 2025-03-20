package figures;

import exceptions.InvalidMoveException;

public class King extends Queen {

    public King(LocationX currentX, int currentY) {
        super(currentX, currentY);
        // Override piece name to King.
        this.pieceName = PieceName.KING;
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // King moves one square in any direction.
        int xDiff = Math.abs(x.ordinal() - currentX.ordinal());
        int yDiff = Math.abs(y - currentY);
        if (xDiff <= 1 && yDiff <= 1) {
            currentX = x;
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for King.");
        }
    }
    
    @Override
    public String toString() {
        return "King at " + currentX + currentY;
    }
}