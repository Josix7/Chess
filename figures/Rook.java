package figures;

import exceptions.InvalidMoveException;

//Author: Jose Luis Hernandez
//Description: this is the rook class it will chexk if the rooks movement across the x and y axis to make 
//sure that they are equal to each other. It will also inherit from the figure interface.

public class Rook extends Figure {

    public Rook(LocationX currentX, int currentY) {
        super(PieceName.ROOK, currentX, currentY);
    }
    
    @Override
    public Boolean moveTo(LocationX x, int y) throws InvalidMoveException {
        // Rook moves horizontally or vertically.
        if(x == currentX || y == currentY) {
            currentX = x;
            currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for Rook.");
        }
    }
    
    @Override
    public String toString() {
        return "Rook at " + currentX + currentY;
    }
}