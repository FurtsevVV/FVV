package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        file1.createNewFile();

        FileWriter writer = new FileWriter(file1);
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100);

            writer.write(Integer.toString(a));
            writer.write(System.getProperty("line.separator"));
        }
        writer.close();
        fillFile(file2, file1);
        printResult(file2);

    }

    public static void fillFile(File fileResult, File fileSource) throws IOException {
        FileWriter writer = new FileWriter(fileResult);

        List<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(fileSource);
        fileResult.createNewFile();
        int sum = 0;
        double average;
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            int x = Integer.parseInt(a);
            array.add(x);
        }
        for (int i = 0; i < array.size(); i += 20) {
            for (int y = i; y < i + 20; y++) {
                sum += array.get(y);
            }
            average = (double) sum / 20;
            String aver = Double.toString(average);
            writer.write(aver);
            writer.write(System.getProperty("line.separator"));
            sum = 0;
        }
        writer.close();
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double summma = 0;
        while (scanner.hasNextLine()) {
            for (int i = 0; i < 50; i++) {
                String a = scanner.nextLine();
                double dd = Double.parseDouble(a);
                summma += dd;
            }
            System.out.println((int) summma);
        }
    }
}
