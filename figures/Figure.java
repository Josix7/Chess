package figures;

import exceptions.InvalidMoveException;

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