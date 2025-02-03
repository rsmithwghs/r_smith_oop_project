package controller;

import model.TicModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicControllerTest {

    @Test
    public void test_getPieceAt_return_Piece() {
        TicModel model1 = new TicModel();
        TicController cont1 = new TicController(model1);
        cont1.placePieceAt(1,1);
        assertNotEquals('-', cont1.getPieceAt(1,1));
    }

    @Test
    public void placePieceAt() {
        TicModel model2 = new TicModel();
        TicController cont2 = new TicController(model2);
        cont2.placePieceAt(1,1);
        assertNotEquals('-', cont2.getPieceAt(1,1));
    }

    @Test
    public void test_getPlayerNum_returnTurn() {
        TicModel model3 = new TicModel();
        TicController cont3 = new TicController(model3);
        cont3.getPlayerNum();
        assertEquals(1,cont3.getPlayerNum());
    }
}