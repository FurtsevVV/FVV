package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessParty = new ChessPiece[8][8];
        for (int i = 0; i < chessParty.length; i++) {
            for (int y = 0; y < chessParty[i].length; y++) {
                chessParty[i][y] = ChessPiece.EMPTY;
            }
        }
        chessParty[0][0] = ChessPiece.ROOK_BLACK;
        chessParty[0][5] = ChessPiece.ROOK_BLACK;
        chessParty[0][6] = ChessPiece.KING_BLACK;

        chessParty[1][1] = ChessPiece.ROOK_WHITE;
        chessParty[1][4] = ChessPiece.PAWN_BLACK;
        chessParty[1][5] = ChessPiece.PAWN_BLACK;
        chessParty[1][7] = ChessPiece.PAWN_BLACK;

        chessParty[2][0] = ChessPiece.PAWN_BLACK;
        chessParty[2][2] = ChessPiece.KNIGHT_BLACK;
        chessParty[2][6] = ChessPiece.PAWN_BLACK;

        chessParty[3][0] = ChessPiece.QUEEN_BLACK;
        chessParty[3][3] = ChessPiece.BISHOP_WHITE;

        chessParty[4][3] = ChessPiece.BISHOP_BLACK;
        chessParty[4][4] = ChessPiece.PAWN_WHITE;

        chessParty[5][4] = ChessPiece.BISHOP_WHITE;
        chessParty[5][5] = ChessPiece.PAWN_WHITE;

        chessParty[6][0] = ChessPiece.PAWN_WHITE;
        chessParty[6][3] = ChessPiece.QUEEN_WHITE;
        chessParty[6][5] = ChessPiece.PAWN_WHITE;
        chessParty[6][7] = ChessPiece.PAWN_WHITE;

        chessParty[7][5] = ChessPiece.ROOK_WHITE;
        chessParty[7][6] = ChessPiece.KING_WHITE;


        ChessBoard cb = new ChessBoard(chessParty);
        cb.print(chessParty);


    }
}
