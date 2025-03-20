package board;

import figures.LocationX;
import exceptions.InvalidCoordinateException;

public class ChessBoard implements IntChessBoard {

    @Override
    public Boolean verifyCoordinate(LocationX x, int y) throws InvalidCoordinateException {
        if (x == null) {
            throw new InvalidCoordinateException("X coordinate cannot be null.");
        }
        // Since LocationX is an enum, valid values are inherently A–H.
        if (y < 1 || y > 8) {
            throw new InvalidCoordinateException("Y coordinate must be between 1 and 8.");
        }
        return true;
    }
    
    // Additional board methods (like piece placement, move history, etc.) can be added here.
}