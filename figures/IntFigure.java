package figures;

import exceptions.InvalidMoveException;

public interface IntFigure {
    Boolean moveTo(LocationX x, int y) throws InvalidMoveException;
}