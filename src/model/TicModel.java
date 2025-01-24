package model;

public class TicModel extends ATTTModel {
    @Override
    public char getPieceAt(int row, int col) {
        return 0;
    }

    @Override
    public boolean isEmpty(int row, int col) {
        return false;
    }

    @Override
    public boolean placePieceAt(int row, int col) {
        return false;
    }

    @Override
    public int getPlayerNum() {
        return 0;
    }
}
