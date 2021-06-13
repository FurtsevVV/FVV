package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        Integer maxThree = 0;
        Integer indexx;
        List<Integer> list = new ArrayList<>();
        List<Integer> listIndex = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
            list.add(array[i]);
        }
Integer summa;
        for (int i = 1; i < 99; i++) {
        summa = (list.get(i) + list.get(i - 1) + list.get(i + 1));
        if (summa > maxThree) {
            maxThree = summa;
            indexx = i-1;
            listIndex.add(indexx);
        }
        }
            System.out.println(maxThree);
        System.out.println(listIndex.get(listIndex.size() - 1));

    }}

