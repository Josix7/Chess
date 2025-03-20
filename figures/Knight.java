package figures;

import exceptions.InvalidMoveException;

public class Knight extends Figure {

    public Knight(LocationX currentX, int currentY) {
        super(PieceName.KNIGHT, currentX, currentY);
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // Knight moves in an “L” shape: two in one direction and one perpendicular.
        int xDiff = Math.abs(x.ordinal() - currentX.ordinal());
        int yDiff = Math.abs(y - currentY);
        if ((xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2)) {
            currentX = x;
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for Knight.");
        }
    }
    
    @Override
    public String toString() {
        return "Knight at " + currentX + currentY;
    }
}