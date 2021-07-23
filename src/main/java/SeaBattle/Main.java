package SeaBattle;


import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        String takePositionRed = "Под покровом ночи флот" + ANSI_RED + " русских " + ANSI_RESET + "занимает позиции. ";

        Field myPositionBlue = new Field();
        Field myPositionRed = new Field();
        Field enemyPositionRed = new Field();
        Field enemyPositionBlue = new Field();
        Player playerBlue = new Player(ANSI_BLUE + "Шведы" + ANSI_RESET);
        Player playerRed = new Player(ANSI_RED + "Русские" + ANSI_RESET);


        System.out.printf("%25s %n", "\t \t Летом  1790 года" + ANSI_RED + " русский" + ANSI_RESET + " флот под  командованием  адмирала  В. Я. Чичагова блокировал" + ANSI_BLUE + " шведский" + ANSI_RESET + " флот");
        System.out.printf("%25s %n", "под командованием принца Карла Сёдерманландского в Выборгском заливе после неудачной попытки высадки десанта.");
        System.out.printf("%25s %n", "Утром 22 июня" + ANSI_BLUE + " шведский" + ANSI_RESET + " флот, испытывающий недостаток припасов, пользуясь попутным ветром, начал прорыв! ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Для начала игры наберите " + ANSI_YELLOW + "Старт" + ANSI_RESET);
        startGame("Старт");


        System.out.println(playerBlue.getTakePosition());
        playerBlue.deploy1deckShip(playerBlue, myPositionBlue);
        System.out.println(myPositionBlue);
        playerBlue.deploy2deckShip(myPositionBlue);
        System.out.println(myPositionBlue);
        playerBlue.deploy3deckShip(myPositionBlue);
        System.out.println(myPositionBlue);
        playerBlue.deploy4deckShip(myPositionBlue);
        System.out.println(myPositionBlue);
        System.out.println("Флот" + ANSI_BLUE + " шведов" + ANSI_RESET + " размещен!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(takePositionRed);
        playerRed.deploy1deckShip(playerRed, myPositionRed);
        System.out.println(myPositionRed);
        playerRed.deploy2deckShip(myPositionRed);
        System.out.println(myPositionRed);
        playerRed.deploy3deckShip(myPositionRed);
        System.out.println(myPositionRed);
        playerRed.deploy4deckShip(myPositionRed);
        System.out.println(myPositionRed);
        System.out.println("Флот" + ANSI_RED + " русских" + ANSI_RESET + " размещен!");

        randomFirstTurn(playerRed, playerBlue, myPositionRed, enemyPositionRed, myPositionBlue, enemyPositionBlue);


    }

    public static void startGame(String start) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            start = sc.nextLine();

            if (start.equals("Старт")) {

                return;
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }

    public static void turn(Player player, Player enemyPlayer, Field myPosition, Field myField, Field enemyPosition, Field enemyField) {
//myPosition - current player position, myField - field for enemy targeting, enemyPosition - current enemy position (hide), enemy Field - field for my targeting
        System.out.println(player.getName() + " делают ход!");
        System.out.println(enemyField);
        System.out.println("Целься! Введите координаты выстрела (без скобок) в формате {x,y}:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            if (!a.matches("\\d+[,]\\d+")) {
                System.out.println("Неверный формат ввода");
                continue;
            }
            String[] aa = a.split(",");
            int x = Integer.parseInt(aa[0]);
            int y = Integer.parseInt(aa[1]);
            if ((x > 10) || (x < 1) || (y > 10) || (y < 1)) {
                System.out.println("Некорректный ввод. Значения должны быть от 1 до 10");

            } else {
                if (enemyPosition.fireStrikeEnemyField(x, y)) {
                    enemyField.fireStrike(x, y);
                    if (enemyPosition.isDestroyed(x, y))
                        enemyPosition.generateMiss(enemyField);

                    if (enemyPosition.gameOver(enemyPosition)) {
                        System.out.println("Игра окончена!");
                        System.out.println(player.getName() + " победили!");
                        System.out.println(enemyField);
                        break;
                    }
                    turn(player, enemyPlayer, myPosition, myField, enemyPosition, enemyField);

                } else {
                    enemyField.missStrike(x, y);
                    turn(enemyPlayer, player, enemyPosition, enemyField, myPosition, myField);
                }

            }
        }
    }

    public static void randomFirstTurn(Player player, Player enemyPlayer, Field myPosition, Field myField, Field enemyPosition, Field enemyField) {
        int a = ((int) (Math.random() * 2 + 1));
        if (a == 1) {
            turn(player, enemyPlayer, myPosition, myField, enemyPosition, enemyField);
        }
        if (a == 2) {
            turn(enemyPlayer, player, enemyPosition, enemyField, myPosition, myField);
        }
    }

}






