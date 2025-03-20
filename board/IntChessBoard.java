package board;

import figures.LocationX;
import exceptions.InvalidCoordinateException;

public interface IntChessBoard {
    Boolean verifyCoordinate(LocationX x, int y) throws InvalidCoordinateException;
}