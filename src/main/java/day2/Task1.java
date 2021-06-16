package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите этажность дома: ");
        int qlevel = sc.nextInt();
        if (qlevel <= 0) {
            System.out.println("Ошибка ввода");
        } else if (qlevel >= 1 && qlevel <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (qlevel >= 5 && qlevel <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (qlevel >= 9) {
            System.out.println("Многоэтажный дом");
        }
    }
}

