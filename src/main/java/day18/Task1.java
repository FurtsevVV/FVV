package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 4, 5, 456, 7823, 456, 10};
        System.out.println(recursionSum(numbers, numbers.length));

    }

    public static int recursionSum(int[] array, int n) {
        if (n <= 0)
            return 0;
        return (recursionSum(array, n - 1) + array[n - 1]);
    }

}