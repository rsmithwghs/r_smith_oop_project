package controller;

import model.TicModel;

public class TicController implements TTTController {
    TicModel model;
    public int turn = model.turn;
    public TicController(){

    }
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
        return false;
    }

    @Override
    public int getPlayerNum() {

        return turn;
    }

    @Override
    public int getGameWinner() {
        return 0;
    }
}
