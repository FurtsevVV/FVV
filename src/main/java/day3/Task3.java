package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double result;
        for (int i = 0; i < 5; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            result = a / b;
            System.out.println(result);
        }
    }
}
