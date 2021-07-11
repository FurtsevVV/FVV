package day19.task3;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/JavaMarathon2021/JavaMarathon2021/src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        Map<Integer, Point> taxiMap = new HashMap<>();
        while (scanner.hasNextLine()) {
            String[] a = scanner.nextLine().split(" ");
            for (String arr : a) {
                taxiMap.put(Integer.parseInt(a[0]), new Point(Integer.parseInt(a[1]), Integer.parseInt(a[2])));
            }
        }
        scanner.close();

        int x1 = userInput("Введите координату х1: ");
        int y1 = userInput("Введите координату y1: ");
        int x2 = userInput("Введите координату x2: ");
        int y2 = userInput("Введите координату y2: ");
//назначаем значения абсолютного прямоугольника в котором всегда x1y1 слева сверху, а x2y2 справа снизу
        int x1abs;
        int x2abs;
        int y1abs;
        int y2abs;

        if (x1 < x2) {
            x1abs = x1;
            x2abs = x2;
        } else {
            x1abs = x2;
            x2abs = x1;
        }

        if (y1 > y2) {
            y1abs = y1;
            y2abs = y2;
        } else {
            y1abs = y2;
            y2abs = y1;
        }
        int taxiInArea = 0;
        for (Map.Entry<Integer, Point> entry : taxiMap.entrySet()) {
            if (((x1abs < entry.getValue().getX()) && (entry.getValue().getX() < x2abs)) && ((entry.getValue().getY() < y1abs) && (entry.getValue().getY() > y2abs))) {
                System.out.println(entry.getKey());
                taxiInArea++;
            }

        }
        System.out.println("Car in area: " + taxiInArea);


    }

    private static int userInput(String message) {
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            System.out.println(message);
            i = Integer.parseInt(sc.next());
            if (i < 0 || i >= 100) {
                System.out.println("Неверный ввод");

            } else {
                return i;
            }
        }

    }

}

