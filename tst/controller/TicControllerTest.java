package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicControllerTest {

    @Test
    void test_getPieceAt_return_Piece() {
        TicController cont1 = new TicController();
        cont1.placePieceAt(1,1);
        assertNotEquals('-', cont1.getPieceAt(1,1));
    }

    @Test
    void placePieceAt() {
    }

    @Test
    void getPlayerNum() {
    }
}