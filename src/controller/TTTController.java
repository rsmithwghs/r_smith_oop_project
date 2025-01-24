package controller;

public interface TTTController {

    char getPieceAt(int row, int col);

    // Should return true if the piece was successfully placed
    boolean placePieceAt(int row, int col);

    boolean isGameOver();

    int getPlayerNum();

    // Return 1 for Player 1, 2 for Player 2, anything else means tie
    int getGameWinner();
}
