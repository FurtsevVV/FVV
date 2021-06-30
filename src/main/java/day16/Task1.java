package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:/JavaMarathon2021/JavaMarathon2021/TextFile.txt");
        printResult(file1);


    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList array = new ArrayList();
        double result;
        int sum = 0;
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            int x = Integer.parseInt(a);
            array.add(x);
        }
        for (int i = 0; i < array.size(); i++) {
            sum += (int) array.get(i);
        }
        result = (double) sum / array.size();
        System.out.println(sum);
        System.out.println(result);
        System.out.println(round(result, 3));
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}



