package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}