package model;

import java.util.Arrays;

public abstract class ATTTModel implements TTTModel {
    // '-' means that the space is empty.  You decide what player 1 and 2 is.
    protected char[][] board;

    protected ATTTModel() {
        board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, '-');
        }
    }
}
