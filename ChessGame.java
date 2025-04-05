
import java.util.Scanner;
import figures.*;
import board.*;
import exceptions.*;

/**
 * Main driver class for the Chess Game application.
 * <p>
 * This class handles all user interaction, including:
 * <ul>
 *     <li>Prompting for piece type and coordinates</li>
 *     <li>Validating input</li>
 *     <li>Creating the correct chess piece</li>
 *     <li>Executing and verifying the move</li>
 * </ul>
 * </p>
 * 
 * Uses various classes from the {@code figures}, {@code board}, and {@code exceptions} packages.
 * 
 * @author Jose Luis Hernandez
 * @version 5.1
 */

public class ChessGame {
    /**
     * The entry point of the Chess Game application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntChessBoard board = new ChessBoard();
        
        try {
            // Prompt for chess piece input.
            System.out.println("Enter chess piece (KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN):");
            String pieceInput = scanner.nextLine().toUpperCase();
            PieceName pieceName;
            try {
                pieceName = PieceName.valueOf(pieceInput);
            } catch (IllegalArgumentException e) {
                throw new InvalidPieceException("Invalid chess piece: " + pieceInput);
            }
            
            // Prompt for X coordinate.
            System.out.println("Enter X coordinate (A, B, C, D, E, F, G, H):");
            String xInput = scanner.nextLine().toUpperCase();
            LocationX posX;
            try {
                posX = LocationX.valueOf(xInput);
            } catch (IllegalArgumentException e) {
                throw new InvalidCoordinateException("Invalid X coordinate: " + xInput);
            }
            
            // Prompt for Y coordinate.
            System.out.println("Enter Y coordinate (1-8):");
            int posY = Integer.parseInt(scanner.nextLine());
            
            // Verify coordinate validity.
            board.verifyCoordinate(posX, posY);
            
            // Create the chess piece based on user input.
            Figure piece;
            switch(pieceName) {
                case PAWN:
                    piece = new Pawn(posX, posY);
                    break;
                case ROOK:
                    piece = new Rook(posX, posY);
                    break;
                case KNIGHT:
                    piece = new Knight(posX, posY);
                    break;
                case BISHOP:
                    piece = new Bishop(posX, posY);
                    break;
                case QUEEN:
                    piece = new Queen(posX, posY);
                    break;
                case KING:
                    piece = new King(posX, posY);
                    break;
                default:
                    throw new InvalidPieceException("Unhandled chess piece: " + pieceName);
            }
            
            System.out.println("Created: " + piece.toString());
            
            // Prompt for new move coordinates.
            System.out.println("Enter new X coordinate for move (A, B, C, D, E, F, G, H):");
            String newXInput = scanner.nextLine().toUpperCase();
            LocationX newPosX;
            try {
                newPosX = LocationX.valueOf(newXInput);
            } catch (IllegalArgumentException e) {
                throw new InvalidCoordinateException("Invalid X coordinate: " + newXInput);
            }
            
            System.out.println("Enter new Y coordinate for move (1-8):");
            int newPosY = Integer.parseInt(scanner.nextLine());
            board.verifyCoordinate(newPosX, newPosY);
            
            // Attempt to move the piece.
            if (piece.moveTo(newPosX, newPosY)) {
                System.out.println("Move successful: " + piece.toString());
            }
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}