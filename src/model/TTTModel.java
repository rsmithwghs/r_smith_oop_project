package model;

public interface TTTModel {

    char getPieceAt(int row, int col);

    boolean isEmpty(int row, int col);

    void placePieceAt(int row, int col);

}