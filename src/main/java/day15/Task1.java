package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("C:/JavaMarathon2021/JavaMarathon2021/src/main/resources/shoes.csv");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:/JavaMarathon2021/JavaMarathon2021/src/main/resources/missing_shoes.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()){
        String [] str = sc.nextLine().split(";");
if(Integer.parseInt(str[2]) ==0) {
    pw.println(Arrays.toString(str));

}
    }
        pw.close();
}}
