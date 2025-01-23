package controller;

public interface TTTController {
    char getPieceAt(int row, int col);

    void placePieceAt(int row, int col);

    boolean isGameOver();

    int getPlayerNum();

}
