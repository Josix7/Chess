package board;

// Author Jose Luis Hernandez

// This codde is in charge of verifying the bounds of the chess board it does this with 
//the enum x cord as well as the invalid coordinate method pullled from other packages.

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
    
}