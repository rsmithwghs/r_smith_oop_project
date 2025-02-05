package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TicModelTest
 * Tests the TicModel.
 * All tests passed as of 2-4-2025.
 */
class TicModelTest {

    @Test
    public void test_isEmpty_emptyWhenCreated(){
        TicModel model = new TicModel();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                assertTrue(model.isEmpty(i, j));
            }
        }
    }
    @Test
    public void test_placePieceAt_placesX(){
        TicModel model2 = new TicModel();
        model2.placePieceAt(1,1);
        assertNotEquals('-', model2.board[1][1]);
        assertFalse(model2.placePieceAt(1,1));
    }
    @Test
    public void test_getPieceAt_returnPiece(){
        TicModel model3 = new TicModel();
        model3.placePieceAt(1,1);
        assertNotEquals('-', model3.getPieceAt(1,1));
    }
    @Test
    public void test_getPlayerNum_getTurn(){
        TicModel model4 = new TicModel();
        model4.getPlayerNum();
        assertEquals(1, model4.turn);
    }
}