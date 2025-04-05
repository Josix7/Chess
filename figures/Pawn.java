package figures;

import exceptions.InvalidMoveException;

/**
 * Represents a Pawn chess piece.
 * <p>
 * The Pawn moves forward one square vertically. This class inherits from the 
 * {@link Figure} class and overrides the movement logic to enforce pawn-specific rules.
 * </p>
 * 
 * Note: This simplified version does not handle initial double moves, capturing, or en passant.
 * 
 * @author Jose Luis Hernandez
 * @version 5.1
 */

public class Pawn extends Figure {

    /**
     * Constructs a {@code Pawn} with the given starting position.
     *
     * @param currentX The starting X coordinate (column) of the Pawn.
     * @param currentY The starting Y coordinate (row) of the Pawn.
     */


    public Pawn(LocationX currentX, int currentY) {
        super(PieceName.PAWN, currentX, currentY);
    }

     /**
     * Attempts to move the Pawn forward one square vertically.
     * <p>
     * The move is valid only if the X coordinate remains the same and the Y coordinate increases by 1.
     * </p>
     *
     * @param x The new X coordinate (must be the same as the current X).
     * @param y The new Y coordinate (must be exactly one more than the current Y).
     * @return {@code true} if the move is valid and executed.
     * @throws InvalidMoveException if the move is not forward by exactly one square.
     */
    
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

    /**
     * Returns a string representation of the Pawn's current position.
     *
     * @return A string describing the Pawn's position.
     */

    @Override
    public String toString() {
        return "Pawn at " + currentX + currentY;
    }
}