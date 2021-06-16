package day4;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int sumInString = 0;
        int compareSum = 0;
        int indexString = 0;
        int[][] matrice = new int[12][8];
        for (int i = 0; i < matrice.length; i++) {
            for (int y = 0; y < matrice[i].length; y++) {
                matrice[i][y] = random.nextInt(50);
                System.out.print(matrice[i][y] + " ");
                sumInString += matrice[i][y];
            }
            System.out.print("   " + sumInString);

            System.out.println();

            if (sumInString > compareSum) {
                compareSum = sumInString;
                indexString = i;
            }
            sumInString = 0;
        }
        System.out.println(compareSum);
        System.out.println(indexString);
    }

}

