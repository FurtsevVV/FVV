package day4;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> listSumm = new ArrayList<>();

        Random random = new Random();
        int sumInString = 0;
int [][] matrice = new int[12][8];
for (int i = 0; i< matrice.length; i++){
    for (int y = 0; y < matrice[i].length; y++){
        matrice[i][y] = random.nextInt(50);
        System.out.print(matrice[i][y] + " ");
sumInString += matrice [i][y];
    }
listSumm.add(sumInString);
    sumInString = 0;
    System.out.println();
}
 Integer max = Collections.max(listSumm);
        System.out.println(listSumm.indexOf(max));
    }

    }

