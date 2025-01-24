package model;

public interface TTTModel {

    char getPieceAt(int row, int col);

    boolean isEmpty(int row, int col);

    // Should return true if the piece was successfully placed
    boolean placePieceAt(int row, int col);

    // Returns the current player numbers turn
    int getPlayerNum();

}