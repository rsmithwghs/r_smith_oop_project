package controller;

import model.TicModel;

/**
 * TicController
 * Written by R. Smith
 * Works with the model, and also deals with game over and determining the winner.
 */
public class TicController implements TTTController {
    TicModel model;

    public TicController(TicModel model){
        // Set up constructor
        this.model = model;
        int turn = model.getPlayerNum();
    }
    /*
     Both getPieceAt and placePieceAt don't do anything unique,
     they just return the results of the functions from the Model.
    */
    @Override
    public char getPieceAt(int row, int col) {
        return model.getPieceAt(row, col);
    }

    @Override
    public boolean placePieceAt(int row, int col) {
        return model.placePieceAt(row, col);
        
    }

    @Override
    public boolean isGameOver() {
        // Determines if the game is over.
        for (int i = 0; i < 3; i++) {
            // Row checker
            if (model.getPieceAt(0, i) == model.getPieceAt(1, i) && model.getPieceAt(0, i) == model.getPieceAt(2, i) && model.getPieceAt(0, i) != '-') {
                return true; // Check rows for any empty spots.
            }
            // Column checker
            if (model.getPieceAt(i, 0) == model.getPieceAt(i, 1) && model.getPieceAt(i, 0) == model.getPieceAt(i, 2) && model.getPieceAt(i, 0) != '-') {
                return true; // Check columns for any empty spots.
            }
        }
        boolean diag1 = model.getPieceAt(0, 0) == model.getPieceAt(1, 1) && model.getPieceAt(0, 0) == model.getPieceAt(2, 0) && model.getPieceAt(0, 0) != '-';
        boolean diag2 = model.getPieceAt(0, 2) == model.getPieceAt(1, 1) && model.getPieceAt(0, 2) == model.getPieceAt(2, 0) && model.getPieceAt(0, 2) != '-';
        return diag1 || diag2; // Check diagonals for empty spots.
    }

    @Override
    public int getPlayerNum() {
        /* I noticed that on View the Player number would go beyond 2,
        so hopefully this can fix it. */
        if(model.getPlayerNum() % 2 == 1){
            return 1;
        }
        if(model.getPlayerNum() % 2 == 0){
            return 2;
        }
        return model.getPlayerNum();
    }

    @Override
    public int getGameWinner() {
        /* Checks to see who won TTT.
        Typically one should get 3 pieces in a row/column/diagonal to win. */
        for (int i = 0; i < 3; i++){ // Check rows for a winner
            if (model.board[i][0] == model.board[i][1] && model.board[i][0] == model.board[i][2]){
                if (model.board[i][0] == 'x'){
                    return 1;
                }
                if (model.board[i][0] == 'o'){
                    return 2;
                }
            }
        }
        for (int j = 0; j < 3; j++){ // Check columns for a winner
            if (model.board[0][j] == model.board[1][j] && model.board[0][j] == model.board[2][j]){
                if (model.board[0][j] == 'x'){
                    return 1;
                }
                if (model.board[0][j] == 'o'){
                    return 2;
                }
            }
        } // Check diagonals for a winner,
        if (model.board[0][0] == model.board[1][1] && model.board[1][1] == model.board[2][2]){

            if (model.board[0][0] == 'x'){
                return 1;
            }
            if (model.board[0][0] == 'o'){
                return 2;
            }
        }
        if (model.board[0][2] == model.board[1][1] && model.board[1][1] == model.board[2][0]){
            if (model.board[0][2] == 'x'){
                return 1;
            }
            if (model.board[0][2] == 'o'){
                return 2;
            }
        }
        // add 0 as a placeholder just so JUnit won't have a fit.
        return 0;
    }
}
