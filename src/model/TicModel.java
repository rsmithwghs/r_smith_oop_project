package model;

public class TicModel extends ATTTModel {
    private int turn = 1;
    @Override
    public char getPieceAt(int row, int col) {
        return board[row][col];
    }

    @Override
    public boolean isEmpty(int row, int col) {
        return board[row][col] == '-';
    }

    @Override
    public boolean placePieceAt(int row, int col) {
        board[row][col] = 'x';
        if (board[row][col] != '-'){
            return false;
        }
        turn ++;
        return true;
    }

    @Override
    public int getPlayerNum() {
        return turn;
    }
}
