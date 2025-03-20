package figures;

import exceptions.InvalidMoveException;

/**
 * Author: Jose Luis Hernandez
 * Description: This abstract class provides common fields and methods for all chess pieces.
 * It partially implements the IntFigure interface and serves as the base class for specific pieces.
 */

public abstract class Figure implements IntFigure {
    protected PieceName pieceName;
    protected LocationX currentX;
    protected int currentY;
    
    public Figure(PieceName pieceName, LocationX currentX, int currentY) {
        this.pieceName = pieceName;
        this.currentX = currentX;
        this.currentY = currentY;
    }
    
    public PieceName getPieceName() {
        return pieceName;
    }
    
    public LocationX getCurrentX() {
        return currentX;
    }
    
    public int getCurrentY() {
        return currentY;
    }
    
    @Override
    public abstract Boolean moveTo(LocationX x, int y) throws InvalidMoveException;
    
    @Override
    public abstract String toString();
}