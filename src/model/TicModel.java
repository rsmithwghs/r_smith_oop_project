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
        if (turn % 2 == 0){
            board[row][col] = 'o';
        }
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
