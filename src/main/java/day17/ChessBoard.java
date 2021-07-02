package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChessBoard {
    public ChessBoard(ChessPiece[][] arrays) {

    }

    public void print(ChessPiece[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int y = 0; y < arrays[i].length; y++) {
                System.out.print((arrays[i][y]));
            }
            System.out.println();
        }
    }
}
