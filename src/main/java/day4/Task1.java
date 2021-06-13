package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int counter8 = 0;
        int counter1 = 0;
        int counterChet = 0;
        int sum = 0;

        int arrLength = sc.nextInt();
        int [] array = new int [arrLength];
        for (int i = 0; i< array.length; i++){
            array[i] = rand.nextInt(10);
            if (array[i] > 8){
                counter8++;
            }
            if (array[i] == 1){
                counter1++;
            }
            if (array[i]%2 == 0){
                counterChet++;
            }
            sum = sum + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counterChet);
        System.out.println("Количество нечетных чисел " + (array.length - counterChet));
        System.out.println("Сумма всех элементов массива: " + sum );

    }
}
