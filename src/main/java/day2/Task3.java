package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        int i = a;
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (i > a && i < b){
            if (i%5 == 0 && i%10 >0){
                System.out.println(i);
            }
            i++;
        }
    }
}
