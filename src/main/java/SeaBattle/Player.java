package SeaBattle;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    private String takeOneDeck = "Разместите 4 однопалубных корабля. Введите координаты (без скобок) в формате {х1,y1}:";
    private String takeTwoDeck = "Разместите 3 двухпалубных корабля. Введите координаты (без скобок) в формате {х1,y1 x2,y2}:";
    private String takeThreeDeck = "Разместите 2 трехпалубных корабля. Введите координаты (без скобок) в формате {х1,y1 x2,y2 x3,y3}:";
    private String takeFourDeck = "Разместите 1 четырехпалубный корабль. Введите координаты (без скобок) в формате {х1,y1 x2,y2 x3,y3 x4,y4}:";
    private String takePosition = "Под покровом ночи флот" + ANSI_BLUE + " шведов " + ANSI_RESET + "занимает позиции. ";

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTakePosition() {
        return takePosition;
    }


    public void deploy1deckShip(Player player, Field myPosition) {
        String[][] kk = myPosition.getField();
        int counter1Deck = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(takeOneDeck);
        while ((counter1Deck < 4)) {
            String a = scanner.nextLine();
            if (!a.matches("\\d+[,]\\d+")) {
                System.out.println("Неверный формат ввода");
                continue;
            }
            String[] aa = a.split(",");
            int x = Integer.parseInt(aa[0]);
            int y = Integer.parseInt(aa[1]);
            if (aa.length != 2) {
                System.out.println("Некорректный ввод значений. Введите значения в формате {x1,y1}");
            } else if ((x > 10) || (x < 1) || (y > 10) || (y < 1)) {
                System.out.println("Некорректный ввод. Значения должны быть от 1 до 10");
            } else if ((kk[x][y].equals(myPosition.getSHIP())) || (kk[x][y].equals(myPosition.getOREOL()))) {
                System.out.println("Неверное расположение");
            } else {
                myPosition.setShip(x, y);
                myPosition.generateOreol(x, y, myPosition);

                counter1Deck++;
            }
        }
    }

    public void deploy2deckShip(Field myPosition) {
        String[][] kk = myPosition.getField();
        int counter2Deck = 0;
        int x1, x2, y1, y2;
        Scanner scanner = new Scanner(System.in);
        System.out.println(takeTwoDeck);
        while (counter2Deck < 3) {
            String coordnnate = scanner.nextLine();
            if (!coordnnate.matches("\\d+[,]\\d+[\\s]\\d+[,]\\d+")) {
                System.out.println("Неверный формат ввода");
                continue;
            }

            String[] a = coordnnate.split(" ");
            String[] aa = a[0].split(",");
            String[] ab = a[1].split(",");

            x1 = Integer.parseInt(aa[0]);
            y1 = Integer.parseInt(aa[1]);
            x2 = Integer.parseInt(ab[0]);
            y2 = Integer.parseInt(ab[1]);

            if ((x1 > 10) || (x1 < 1) || (y1 > 10) || (y1 < 1) || (x2 > 10) || (x2 < 1) || (y2 > 10) || (y2 < 1)) {
                System.out.println("Некорректный ввод. Значения должны быть от 1 до 10");
            } else if ((Math.abs(x1 - x2) > 1 && y1 - y2 == 0) || (Math.abs(y1 - y2) > 1 && x1 - x2 == 0)) {
                System.out.println("Некорректный ввод. Невозможно создать корабль");
            } else if (((x2 == x1 + 1) && (y1 == y2 + 1)) || ((x2 == x1 - 1) && (y1 == y2 - 1)) || ((x2 == x1 - 1) && (y1 == y2 + 1)) || ((x2 == x1 + 1) && (y1 == y2 - 1))) {
                System.out.println("Некорректный ввод. Невозможно создать корабль");
            } else if ((kk[x1][y1].equals(myPosition.getSHIP())) || (kk[x1][y1].equals(myPosition.getOREOL())) || (kk[x2][y2].equals(myPosition.getSHIP())) || (kk[x2][y2].equals(myPosition.getOREOL()))) {
                System.out.println("Неверное расположение");
            } else {
                myPosition.set2deckShip(x1, y1, x2, y2);
                myPosition.generateOreol(x1, y1, myPosition);
                myPosition.generateOreol(x2, y2, myPosition);
                counter2Deck++;
            }

        }

    }

    public void deploy3deckShip(Field myPosition) {
        String kk[][] = myPosition.getField();
        int counter3Deck = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(takeThreeDeck);
        while (counter3Deck < 2) {
            String coordnnate = scanner.nextLine();
            if (!coordnnate.matches("\\d+[,]\\d+[\\s]\\d+[,]\\d+[\\s]\\d+[,]\\d+")) {
                System.out.println("Неверный формат ввода");
                continue;
            }
            String[] a = coordnnate.split(" ");
            String[] aa = a[0].split(",");
            String[] ab = a[1].split(",");
            String[] ac = a[2].split(",");
            int x1 = Integer.parseInt(aa[0]);
            int y1 = Integer.parseInt(aa[1]);
            int x2 = Integer.parseInt(ab[0]);
            int y2 = Integer.parseInt(ab[1]);
            int x3 = Integer.parseInt(ac[0]);
            int y3 = Integer.parseInt(ac[1]);
            if (aa.length != 2 || ab.length != 2 || ac.length != 2) {
                System.out.println("Некорректный ввод значений. Введите значения в формате {x1,y1 x2,y2 x3,y3}");
            } else if ((x1 > 10) || (x1 < 1) || (y1 > 10) || (y1 < 1) || (x2 > 10) || (x2 < 1) || (y2 > 10) || (y2 < 1) || (x3 > 10) || (x3 < 1) || (y3 > 10) || (y3 < 1)) {
                System.out.println("Некорректный ввод. Значения должны быть от 1 до 10");
            } else if (Math.abs(x1 - x2) != (Math.abs(x2 - x3)) || Math.abs(y1 - y2) != Math.abs(y2 - y3)) {
                System.out.println("Некорректный ввод. Невозможно создать корабль");
            } else if ((kk[x1][y1].equals(myPosition.getSHIP())) || (kk[x1][y1].equals(myPosition.getOREOL())) || (kk[x2][y2].equals(myPosition.getSHIP())) || (kk[x2][y2].equals(myPosition.getOREOL())) || (kk[x3][y3].equals(myPosition.getSHIP())) || (kk[x3][y3].equals(myPosition.getOREOL()))) {
                System.out.println("Неверное расположение");
            } else {
                myPosition.set3deckShip(x1, y1, x2, y2, x3, y3);
                myPosition.generateOreol(x1, y1, myPosition);
                myPosition.generateOreol(x2, y2, myPosition);
                myPosition.generateOreol(x3, y3, myPosition);
                counter3Deck++;
            }
        }
    }

    public void deploy4deckShip(Field myPosition) {
        String kk[][] = myPosition.getField();
        int counter4Deck = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(takeFourDeck);
        while (counter4Deck < 1) {
            String coordnnate = scanner.nextLine();
            if (!coordnnate.matches("\\d+[,]\\d+[\\s]\\d+[,]\\d+[\\s]\\d+[,]\\d+[\\s]\\d+[,]\\d+")) {
                System.out.println("Неверный формат ввода");
                continue;
            }
            String[] a = coordnnate.split(" ");
            String[] aa = a[0].split(",");
            String[] ab = a[1].split(",");
            String[] ac = a[2].split(",");
            String[] ad = a[3].split(",");
            int x1 = Integer.parseInt(aa[0]);
            int y1 = Integer.parseInt(aa[1]);
            int x2 = Integer.parseInt(ab[0]);
            int y2 = Integer.parseInt(ab[1]);
            int x3 = Integer.parseInt(ac[0]);
            int y3 = Integer.parseInt(ac[1]);
            int x4 = Integer.parseInt(ad[0]);
            int y4 = Integer.parseInt(ad[1]);

            if (aa.length != 2 || ab.length != 2 || ac.length != 2 || ad.length != 2) {
                System.out.println("Некорректный ввод значений. Введите значения в формате {x1,y1 x2,y2 x3,y3 x4,y4}");
            } else if ((x1 > 10) || (x1 < 1) || (y1 > 10) || (y1 < 1) || (x2 > 10) || (x2 < 1) || (y2 > 10) || (y2 < 1) || (x3 > 10) || (x3 < 1) || (y3 > 10) || (y3 < 1) || x4 > 10 || x4 < 1 || y4 > 10 || y4 < 1) {
                System.out.println("Некорректный ввод. Значения должны быть от 1 до 10");
            } else if (Math.abs(x1 - x2) != (Math.abs(x2 - x3)) || Math.abs(y1 - y2) != Math.abs(y2 - y3) || Math.abs(y3 - y4) != Math.abs(y1 - y2) || Math.abs(x1 - x2) != (Math.abs(x3 - x4))) {
                System.out.println("Некорректный ввод. Невозможно создать корабль");
            } else if ((kk[x1][y1].equals(myPosition.getSHIP())) || (kk[x1][y1].equals(myPosition.getOREOL())) || (kk[x2][y2].equals(myPosition.getSHIP())) || (kk[x2][y2].equals(myPosition.getOREOL())) || (kk[x3][y3].equals(myPosition.getSHIP())) || (kk[x3][y3].equals(myPosition.getOREOL())) || (kk[x4][y4].equals(myPosition.getSHIP())) || (kk[x4][y4].equals(myPosition.getOREOL()))) {
                System.out.println("Неверное расположение");
            } else {
                myPosition.set4deckShip(x1, y1, x2, y2, x3, y3, x4, y4);
                myPosition.generateOreol(x1, y1, myPosition);
                myPosition.generateOreol(x2, y2, myPosition);
                myPosition.generateOreol(x3, y3, myPosition);
                myPosition.generateOreol(x4, y4, myPosition);
                counter4Deck++;


            }
        }
    }
}
