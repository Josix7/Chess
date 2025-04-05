package figures;

import exceptions.InvalidMoveException;

/**
 * Represents a Queen chess piece.
 * <p>
 * The Queen combines the movement abilities of both the Rook and the Bishop:
 * it can move any number of squares vertically, horizontally, or diagonally.
 * This class inherits from {@link Rook} and implements {@link IntBishop} to
 * support both types of movement.
 * </p>
 * 
 * @author Jose Luis Hernandez
 * @version 5.1
 */

public class Queen extends Rook implements IntBishop {
        /**
     * Constructs a {@code Queen} piece with the given starting position.
     *
     * @param currentX The starting X coordinate (column) of the Queen.
     * @param currentY The starting Y coordinate (row) of the Queen.
     */

    public Queen(LocationX currentX, int currentY) {
        super(currentX, currentY);
        // Override piece name to Queen.
        this.pieceName = PieceName.QUEEN;
    }
    
    @Override
        /**
     * Attempts to move the Queen diagonally, like a Bishop.
     * <p>
     * A move is considered valid if the absolute difference between the
     * X and Y coordinates matches.
     * </p>
     *
     * @param x The new X coordinate (column) to move to.
     * @param y The new Y coordinate (row) to move to.
     * @return {@code true} if the diagonal move is valid and executed.
     * @throws InvalidMoveException if the move is not a valid diagonal move.
     */
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
    /**
     * Attempts to move the Queen to a new location.
     * <p>
     * A move is valid if it is either a straight move (like a Rook)
     * or a diagonal move (like a Bishop).
     * </p>

     * @param x The new X coordinate (column) to move to.
     * @param y The new Y coordinate (row) to move to.
     * @return {@code true} if the move is valid and executed.
     * @throws InvalidMoveException if the move is not valid for a Queen.
     */
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // Queen can move as a Rook (straight) or as a Bishop (diagonally).
        if (x == currentX || y == currentY) {
            return super.moveTo(x, y);
        } else {
            return moveToBishop(x, y);
        }
    }
    
     /**
     * Returns a string representation of the Queen's current position.
     *
     * @return A string describing the Queen's position.
     */
    @Override
    public String toString() {
        return "Queen at " + currentX + currentY;
    }
}