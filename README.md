# Chess
 
Chess Game Project

Overview

The Chess Game Project is a comprehensive Java application that simulates a chess game using advanced object-oriented programming principles. The project is designed not only to provide a working chess game framework but also to serve as a learning tool for mastering software design, modularization, and robust error handling.

What This Project Is
	•	Chess Simulation:
The project models a chess game with individual classes for each chess piece (Pawn, Rook, Knight, Bishop, Queen, and King), each with its own movement logic.
	•	Board Management:
A dedicated chess board class is responsible for verifying valid coordinates and ensuring moves are within the rules of the chessboard.
	•	Modular Design:
The project is organized into multiple packages, each addressing a specific aspect of the application (chess figures, board management, and exceptions). This modular approach helps in maintaining, scaling, and understanding the codebase.
	•	Interactive Console Application:
Users interact with the game through a console interface where they can choose a chess piece, provide starting coordinates, and attempt moves, with the program validating inputs and moves accordingly.

Skills Being Learned
	•	Object-Oriented Programming (OOP):
	•	Abstraction & Encapsulation:
Utilizes abstract classes and interfaces to define clear, reusable contracts for chess pieces.
	•	Inheritance & Polymorphism:
Demonstrates how classes extend abstract base classes and implement interfaces, enabling flexible code reuse and behavior customization.
	•	Interface Design:
Uses interfaces to ensure that different types of chess pieces adhere to a common set of behaviors, facilitating polymorphic behavior.
	•	Robust Error Handling:
	•	Custom Exceptions:
Implements custom exception classes (e.g., InvalidMoveException, InvalidCoordinateException, and InvalidPieceException) to manage and report errors clearly, making the application more robust and user-friendly.
	•	Modular Code Organization:
	•	Package Structure:
Divides the project into logical packages (e.g., chess.figures, chess.board, and chess.exceptions), emphasizing the importance of separation of concerns and clean code architecture.
	•	Software Design Principles:
	•	Separation of Concerns:
Each component of the application (chess pieces, board functionality, error handling) is developed in its own module, making the system easier to maintain and extend.
	•	Single Responsibility Principle:
Every class and package has a clearly defined role, which enhances readability and scalability.
	•	Practical Java Development:
	•	Enum Usage:
Uses Java enums to represent constant values such as chess piece names and board coordinates, ensuring type safety and reducing errors.
	•	User Input Handling:
Implements console-based interaction, demonstrating basic I/O handling in Java.


The application will prompt you to select a chess piece, enter starting coordinates, and attempt a move. The game validates your input and displays appropriate messages for successful moves or errors.

