package SeaBattle;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

public class Field {
    private final String WAVE = "\uD83C\uDF0A";
    private final String OREOL = "\uD83D\uDFE6";
    private final String MISS = "\u2716";
    private final String SHIP = "\uD83D\uDEA2";
    private final String FIRE = "\uD83D\uDD25";
    private String[][] field = new String[11][11];

    public String getOREOL() {
        return OREOL;
    }

    public String getSHIP() {
        return SHIP;
    }

    public String toString() {                 //вывод поля
        String out = "";
        for (int i = 0; i < field.length; i++) {
            out += Arrays.toString(field[i]).replace(",", " ").replace("[", "").replace("]", "");
            out += "\n";
        }
        return out;
    }

    public String[][] getField() {
        return field;
    }

    public Field() {
        this.field = field;
        for (int i = 0; i < field.length; i++) {
            for (int y = 0; y < field[i].length; y++) {
                field[i][y] = WAVE;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if (i == 10) {
                field[0][i] = Integer.toString(i);
                break;
            }
//            if (i == 4) {
//                field[0][i] = Integer.toString(i);
//                continue;
//            }
            if (i == 3) {
                field[0][i] = Integer.toString(i);
                continue;
            }
//            if (i == 5) {
//                field[0][i] = Integer.toString(i);
//                continue;
//            }
            if (i == 9) {
                field[0][i] = Integer.toString(i);
                continue;
            }

            field[0][i] = Integer.toString(i);
        }
        for (int i = 0; i < field.length; i++) {
            if (i == 10) {
                field[i][0] = Integer.toString(i);
                break;
            }
            field[i][0] = Integer.toString(i);
        }
    }

    public void setShip(int x, int y) {
        field[x][y] = SHIP;
    }

    public void generateOreol(int x, int y, Field myPosition) {
        String[][] kk = myPosition.getField();
        if (((x) == 10) && ((y) == 10)) {
            if (kk[x][y - 1].equals(WAVE) || (kk[x][y - 1].equals(OREOL))) {
                kk[x][y - 1] = OREOL;
            }
            if (kk[x - 1][y - 1].equals(WAVE) || (kk[x - 1][y - 1].equals(OREOL))) {
                kk[x - 1][y - 1] = OREOL;
            }
            if (kk[x - 1][y].equals(WAVE) || (kk[x - 1][y].equals(OREOL))) {
                kk[x - 1][y] = OREOL;
            }
        }
        if ((y + 1) == 11 && x < 10) {
            if (kk[x + 1][y].equals(WAVE) || (kk[x + 1][y].equals(OREOL))) {
                kk[x + 1][y] = OREOL;
            }
            if (kk[x + 1][y - 1].equals(WAVE) || (kk[x + 1][y - 1].equals(OREOL))) {
                kk[x + 1][y - 1] = OREOL;
            }
            if (kk[x][y - 1].equals(WAVE) || (kk[x][y - 1].equals(OREOL))) {
                kk[x][y - 1] = OREOL;
            }
            if (kk[x - 1][y - 1].equals(WAVE) || (kk[x - 1][y - 1].equals(OREOL))) {
                kk[x - 1][y - 1] = OREOL;
            }
            if (kk[x - 1][y].equals(WAVE) || (kk[x - 1][y].equals(OREOL))) {
                kk[x - 1][y] = OREOL;
            }

        }
        if (x + 1 == 11 && y < 10) {
            if (kk[x][y - 1].equals(WAVE) || (kk[x][y - 1].equals(OREOL))) {
                kk[x][y - 1] = OREOL;
            }
            if (kk[x - 1][y - 1].equals(WAVE) || (kk[x - 1][y - 1].equals(OREOL))) {
                kk[x - 1][y - 1] = OREOL;
            }
            if (kk[x - 1][y].equals(WAVE) || (kk[x - 1][y].equals(OREOL))) {
                kk[x - 1][y] = OREOL;
            }
            if (kk[x - 1][y + 1].equals(WAVE) || (kk[x - 1][y + 1].equals(OREOL))) {
                kk[x - 1][y + 1] = OREOL;
            }
            if (kk[x][y + 1].equals(WAVE) || (kk[x][y + 1].equals(OREOL))) {
                kk[x][y + 1] = OREOL;
            }

        }
        if (x < 10 && y < 10) {

            if (kk[x - 1][y - 1].equals(WAVE) || (kk[x - 1][y - 1].equals(OREOL))) {
                kk[x - 1][y - 1] = OREOL;
            }
            if (kk[x - 1][y].equals(WAVE) || (kk[x - 1][y].equals(OREOL))) {
                kk[x - 1][y] = OREOL;
            }
            if (kk[x + 1][y - 1].equals(WAVE) || (kk[x + 1][y - 1].equals(OREOL))) {
                kk[x + 1][y - 1] = OREOL;
            }
            if (kk[x][y - 1].equals(WAVE) || (kk[x][y - 1].equals(OREOL))) {
                kk[x][y - 1] = OREOL;
            }
            if (kk[x][y + 1].equals(WAVE) || (kk[x][y + 1].equals(OREOL))) {
                kk[x][y + 1] = OREOL;
            }
            if (kk[x + 1][y + 1].equals(WAVE) || (kk[x + 1][y + 1].equals(OREOL))) {
                kk[x + 1][y + 1] = OREOL;
            }
            if (kk[x + 1][y].equals(WAVE) || (kk[x + 1][y].equals(OREOL))) {
                kk[x + 1][y] = OREOL;
            }
            if (kk[x - 1][y + 1].equals(WAVE) || (kk[x - 1][y + 1].equals(OREOL))) {
                kk[x - 1][y + 1] = OREOL;
            }
        }
    }


    public void set2deckShip(int x1, int y1, int x2, int y2) {
        field[x1][y1] = SHIP;
        field[x2][y2] = SHIP;
    }

    public void set3deckShip(int x1, int y1, int x2, int y2, int x3, int y3) {
        field[x1][y1] = SHIP;
        field[x2][y2] = SHIP;
        field[x3][y3] = SHIP;
    }

    public void set4deckShip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        field[x1][y1] = SHIP;
        field[x2][y2] = SHIP;
        field[x3][y3] = SHIP;
        field[x4][y4] = SHIP;
    }

    public void fireStrike(int x, int y) {
        field[x][y] = FIRE;

    }

    public void missStrike(int x, int y) {
        if (!field[x][y].equals(FIRE))
            field[x][y] = MISS;
        else
            System.out.println("Сюда уже стреляли!");

    }

    public boolean fireStrikeEnemyField(int x, int y) {
        if (field[x][y].equals(SHIP)) {
            field[x][y] = FIRE;
            System.out.println("Попадание! Стреляем вновь!");
            if (isDestroyed(x, y)) {
                System.out.println("Корабль уничтожен!");

            }

            return true;
        } else {
            System.out.println("Мимо!");
            return false;

        }
    }

    public boolean gameOver(Field enemyField) {
        boolean check = true;

        for (int i = 0; i < enemyField.getField().length; i++) {
            for (int y = 0; y < enemyField.getField()[i].length; y++) {
                if (enemyField.getField()[i][y].equals(SHIP)) {
                    check = false;
                    break;
                }
            }
        }
        return check;

    }

    public void generateMiss(Field enemyField) {
        String[][] field = enemyField.getField();
        for (int i = 1; i < field.length; i++) {
            for (int j = 1; j < field[i].length; j++) {
            //    if (isDestroyed(i,j)) {

                    if (field[i][j].equals(FIRE) && isDestroyed(i,j)) {
                        if (i == 10 && j == 10) {
                            if (field[i][j - 1].equals(WAVE) || field[i][j - 1].equals(MISS)) {
                                field[i][j - 1] = MISS;
                            }
                            if (field[i - 1][j - 1].equals(WAVE) || field[i - 1][j - 1].equals(MISS)) {
                                field[i - 1][j - 1] = MISS;
                            }
                            if (field[i - 1][j].equals(WAVE) || field[i - 1][j].equals(MISS)) {
                                field[i - 1][j] = MISS;
                            }
                        }
                        if (i == 10 && j < 10) {
                            if (field[i][j - 1].equals(WAVE) || (field[i][j - 1].equals(MISS))) {
                                field[i][j - 1] = MISS;
                            }
                            if (field[i - 1][j - 1].equals(WAVE) || (field[i - 1][j - 1].equals(MISS))) {
                                field[i - 1][j - 1] = MISS;
                            }
                            if (field[i - 1][j].equals(WAVE) || (field[i - 1][j].equals(MISS))) {
                                field[i - 1][j] = MISS;
                            }
                            if (field[i - 1][j + 1].equals(WAVE) || (field[i - 1][j + 1].equals(MISS))) {
                                field[i - 1][j + 1] = MISS;
                            }
                            if (field[i][j + 1].equals(WAVE) || (field[i][j + 1].equals(MISS))) {
                                field[i][j + 1] = MISS;
                            }
                        }
                        if (i < 10 && j == 10) {
                            if (field[i - 1][j].equals(WAVE) || (field[i - 1][j].equals(MISS))) {
                                field[i - 1][j] = MISS;
                            }
                            if (field[i - 1][j - 1].equals(WAVE) || (field[i - 1][j - 1].equals(MISS))) {
                                field[i - 1][j - 1] = MISS;
                            }
                            if (field[i][j - 1].equals(WAVE) || (field[i][j - 1].equals(MISS))) {
                                field[i][j - 1] = MISS;
                            }
                            if (field[i + 1][j - 1].equals(WAVE) || (field[i + 1][j - 1].equals(MISS))) {
                                field[i + 1][j - 1] = MISS;
                            }
                            if (field[i + 1][j].equals(WAVE) || (field[i + 1][j].equals(MISS))) {
                                field[i + 1][j] = MISS;
                            }
                        }
                        if (i < 10 && j < 10) {

                            if (field[i - 1][j - 1].equals(WAVE) || field[i - 1][j - 1].equals(MISS)) {
                                field[i - 1][j - 1] = MISS;
                            }
                            if (field[i - 1][j].equals(WAVE) || field[i - 1][j].equals(MISS)) {
                                field[i - 1][j] = MISS;
                            }
                            if (field[i - 1][j + 1].equals(WAVE) || field[i - 1][j + 1].equals(MISS)) {
                                field[i - 1][j + 1] = MISS;
                            }
                            if (field[i][j + 1].equals(WAVE) || field[i][j + 1].equals(MISS)) {
                                field[i][j + 1] = MISS;
                            }
                            if (field[i + 1][j + 1].equals(WAVE) || field[i + 1][j + 1].equals(MISS)) {
                                field[i + 1][j + 1] = MISS;
                            }
                            if (field[i + 1][j].equals(WAVE) || field[i + 1][j].equals(MISS)) {
                                field[i + 1][j] = MISS;
                            }
                            if (field[i + 1][j - 1].equals(WAVE) || field[i + 1][j - 1].equals(MISS)) {
                                field[i + 1][j - 1] = MISS;
                            }
                            if (field[i][j - 1].equals(WAVE) || field[i][j - 1].equals(MISS)) {
                                field[i][j - 1] = MISS;
                            }
                        }
                    }
                }
            }
        }


    public boolean isDestroyed(int x, int y) {
        if (x < 10 && y < 10) {
            if (!field[x - 1][y].equals(SHIP) && !field[x + 1][y].equals(SHIP) && !field[x][y - 1].equals(SHIP) && !field[x][y + 1].equals(SHIP))
                return true;
        }
        if (x == 10 && y == 10) {
            if (!field[x - 1][y].equals(SHIP) && !field[x][y - 1].equals(SHIP))
                return true;
        }
        if (x == 10 && y < 10) {
            if (!field[x - 1][y].equals(SHIP) && !field[x][y - 1].equals(SHIP) && !field[x][y + 1].equals(SHIP))
                return true;
        }
        if (x < 10 && y == 10) {
            if (!field[x - 1][y].equals(SHIP) && !field[x + 1][y].equals(SHIP) && !field[x][y - 1].equals(SHIP))
                return true;
        } else
            return false;

        return false;
    }

}


