package view;

import controller.TicController;
import model.TicModel;

import java.util.Scanner;

/**
 * TicView.java
 * Written by R. Smith
 * Displays the workings of Model and Controller to the user and sends user input back and runs TicTacToe.
 */
public class TicView {
    // Set up Controllers, Models, and Scanners.
    public static TicController cont;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        cont = new TicController(new TicModel());

        while (!cont.isGameOver()){ // Until the game is over, constantly display the board.
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(cont.getPieceAt(i,j));


                }
                System.out.println(); // Some spacing for sanity.
            }
            System.out.println(); // More spacing
            // Ask where the player wants to place a piece.
            System.out.println("NOTE: SPOTS ARE NUMBERED ON ARRAY-INDEXES (0-2) ");
            System.out.print("Player " + cont.getPlayerNum() + ", choose where you want to lay your stone. Input your row then column.");
            int row = input.nextInt(); // Get both the row and the column.
            int col = input.nextInt();
            cont.placePieceAt(row, col); // Follow the player's requested place as long as it's empty.
            // During testing, if you try to place in a non-empty spot, it'll ask again.
        }
        System.out.println("Congrats, Player " + cont.getGameWinner() + ", you won!"); // Get the winner and congratulate them.
    }
}
