package figures;

import exceptions.InvalidMoveException;

/**
 * Represents a Rook chess piece.
 * <p>
 * The Rook can move any number of squares along the same row (X-axis) or column (Y-axis).
 * This class inherits from the {@link Figure} abstract class and overrides the movement behavior.
 * </p>
 * 
 * @author Jose Luis Hernandez
 * @version 5.1
 */

public class Rook extends Figure {
    /**
     * Constructs a {@code Rook} piece with the given starting position.
     *
     * @param currentX The starting X coordinate (column) of the Rook.
     * @param currentY The starting Y coordinate (row) of the Rook.
     */

    public Rook(LocationX currentX, int currentY) {
        super(PieceName.ROOK, currentX, currentY);
    }
        /**
     * Attempts to move the Rook to a new location.
     * <p>
     * A move is valid if the Rook moves in a straight line either horizontally or vertically.
     * </p>
     *
     * @param x The new X coordinate (column) to move to.
     * @param y The new Y coordinate (row) to move to.
     * @return {@code true} if the move is valid and executed.
     * @throws InvalidMoveException if the move is not in a straight line.
     */
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
    /**
     * Returns a string representation of the Rook's current position.
     *
     * @return A string describing the Rook's position.
     */
    @Override
    public String toString() {
        return "Rook at " + currentX + currentY;
    }
}