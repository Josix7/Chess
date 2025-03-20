package figures;
import exceptions.InvalidMoveException;

/**
 * Author: Jose Luis Hernandez
 * Description: This interface defines the contract for moving a chess piece.
 * Any class implementing this interface must provide its own moveTo method.
 */

public interface IntFigure {
    Boolean moveTo(LocationX x, int y) throws InvalidMoveException;
}