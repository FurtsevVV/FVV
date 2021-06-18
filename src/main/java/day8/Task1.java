package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String sum = "0 ";
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");

        }
        System.out.println(sb);
        long timeFinish = System.currentTimeMillis();
        long timeOfWork = timeFinish - timeStart;


        System.out.println("Time of working program: " + timeOfWork + " ms");


        long timeStart2 = System.currentTimeMillis();

        for (int i = 1; i < 20001; i++) {
            String str = Integer.toString(i);
            sum = sum + str + " ";

        }
        System.out.println(sum);
        long timeFinish2 = System.currentTimeMillis();
        long timeOfWork2 = timeFinish2 - timeStart2;
        System.out.println(timeOfWork2);

    }
}
