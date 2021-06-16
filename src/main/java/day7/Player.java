package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static String svMest;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers = 6;
        }
    }

    public int getStamina() {
        if (stamina < 0) {
            return 0;
        }
        return stamina;

    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina = stamina - 1;
        if (stamina == 0) {
            countPlayers--;
        }
    }


    public static void info() {
        switch (countPlayers) {
            case 1:
                svMest = " свободных мест";
                break;
            case 5:
                svMest = " свободное место";
                break;
            default:
                svMest = " свободных места";
        }

        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле ещё есть " + (6 - countPlayers) + svMest);
        } else {
            System.out.println("На поле 6 игроков");
        }
    }

}
