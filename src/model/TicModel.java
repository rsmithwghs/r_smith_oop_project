package model;

/**
 * TicModel.java
 * Written by R. Smith
 * Deals with data (turns, the board, placement of pieces, etc.
 * Is used by the Controller to help run the game.
 */
public class TicModel extends ATTTModel {
    public int turn = 1; // Start turn at 1
    @Override
    public char getPieceAt(int row, int col) { // Simple function to get what's at a specific spot.
        return board[row][col];
    }

    @Override
    public boolean isEmpty(int row, int col) { // Function to see if a specific spot is empty.
        return board[row][col] == '-';
    }

    @Override
    /* Places a player's piece.
     Will return false if spot is already taken. Alternates based on turn. */
    public boolean placePieceAt(int row, int col) {

        if (board[row][col] != '-') { // check to see if spot is empty.
            return false;
        }
        board[row][col] = 'x';
        if (turn % 2 == 0){ // If player 2 is playing, change to the symbol O
            board[row][col] = 'o';
        }


        turn ++; // increment turn by 1 after placement
        return true;
    }

    @Override
    public int getPlayerNum() { // get who's currently playing.
        return turn;
    }
}
