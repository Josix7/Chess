package board;

// Author: Jose Luis Hernandez
// Description: This interface defines the contract for verifying the bounds of a chessboard.
// It declares a method to validate that the provided X coordinate (using the LocationX enum)
// and Y coordinate are within the acceptable limits of a standard chessboard.

import figures.LocationX;
import exceptions.InvalidCoordinateException;

public interface IntChessBoard {
    Boolean verifyCoordinate(LocationX x, int y) throws InvalidCoordinateException;
}