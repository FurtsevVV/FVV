package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:/JavaMarathon2021/JavaMarathon2021/TextFile.txt");
        printResult(file1);


    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        double result;
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            int x = Integer.parseInt(a);

            counter++;
            sum += x;
        }

        result = (double) sum / counter;
        System.out.println(sum);
        System.out.println(result);
        System.out.printf("%.3f", +result);
    }


}



