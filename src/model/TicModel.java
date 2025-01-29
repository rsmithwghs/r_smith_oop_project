package model;

public class TicModel extends ATTTModel {
    public int turn = 1;
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

        if (board[row][col] != '-') {
            return false;
        }
        board[row][col] = 'x';
        if (turn % 2 == 0){
            board[row][col] = 'o';
        }


        turn ++;
        return true;
    }

    @Override
    public int getPlayerNum() {
        return turn;
    }
}
