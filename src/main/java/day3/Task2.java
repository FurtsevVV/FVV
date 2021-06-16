package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        while (true) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            if (b == 0) {
                break;
            }

            double result = a / b;
            System.out.println(result);
        }
    }
}
