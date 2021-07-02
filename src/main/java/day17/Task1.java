package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] arrayPiece = new ChessPiece[8];
        arrayPiece[0] = ChessPiece.PAWN_WHITE;
        arrayPiece[1] = ChessPiece.PAWN_WHITE;
        arrayPiece[2] = ChessPiece.PAWN_WHITE;
        arrayPiece[3] = ChessPiece.PAWN_WHITE;
        arrayPiece[4] = ChessPiece.ROOK_BLACK;
        arrayPiece[5] = ChessPiece.ROOK_BLACK;
        arrayPiece[6] = ChessPiece.ROOK_BLACK;
        arrayPiece[7] = ChessPiece.ROOK_BLACK;

        for (int i = 0; i < arrayPiece.length; i++) {
            System.out.print(arrayPiece[i]);
        }

    }


}