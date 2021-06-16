package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int max = 0;
        int counterEnd0 = 0;
        int sum0 = 0;

        int min = 10000;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        for (int arr : array) {
            if (arr > max) {
                max = arr;
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        for (int arr : array) {
            if (arr < min) {
                min = arr;
            }
        }
        System.out.println("Минимальное значение массива: " + min);

        for (Integer arr : array) {
            if (arr % 10 == 0) {
                sum0 = sum0 + arr;
                counterEnd0++;

            }

        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counterEnd0);
        System.out.println("Сумма элементов массива заканчивающихся на 0: " + sum0);
    }
}
