package controller;

import model.TicModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicControllerTest {

    @Test
    public void test_getPieceAt_return_Piece() {
        TicModel model1 = new TicModel();
        TicController cont1 = new TicController(model1);
        cont1.placePieceAt(1, 1);
        assertNotEquals('-', cont1.getPieceAt(1, 1));
    }

    @Test
    public void placePieceAt() {
        TicModel model2 = new TicModel();
        TicController cont2 = new TicController(model2);
        cont2.placePieceAt(1, 1);
        assertNotEquals('-', cont2.getPieceAt(1, 1));
    }

    @Test
    public void test_getPlayerNum_returnTurn() {
        TicModel model3 = new TicModel();
        TicController cont3 = new TicController(model3);
        cont3.getPlayerNum();
        assertEquals(1, cont3.getPlayerNum());
    }

    @Test
    public void test_isGameOver_endGame() {
        TicModel model4 = new TicModel();
        TicController cont4 = new TicController(model4);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cont4.placePieceAt(i, j);
            }

        }
        assertTrue(cont4.isGameOver());
    }

    @Test
    public void test_getGameWinner_findWinner() {
        TicModel model5 = new TicModel();
        TicController cont5 = new TicController(model5);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cont5.placePieceAt(i, j);
            }
        }
        assertEquals(1, cont5.getGameWinner());
    }
}