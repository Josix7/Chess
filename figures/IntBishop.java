package figures;

import exceptions.InvalidMoveException;

public interface IntBishop {
    Boolean moveToBishop(LocationX x, int y) throws InvalidMoveException;
}