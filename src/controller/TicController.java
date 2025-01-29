package controller;

import model.TicModel;

public class TicController implements TTTController {
    private TicModel model;

    public TicController(TicModel model){
        this.model = model;
    }
    @Override
    public char getPieceAt(int row, int col) {
        return 0;
    }

    @Override
    public boolean placePieceAt(int row, int col) {
        return false;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public int getPlayerNum() {
        return 0;
    }

    @Override
    public int getGameWinner() {
        return 0;
    }
}
