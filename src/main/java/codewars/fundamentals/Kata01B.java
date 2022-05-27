package codewars.fundamentals;

public class Kata01B {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }

        int swapper;
        for (int i = 0; i < (numbers.length - 1); i++) {
            int n = i;
            while (numbers[n] > numbers[n+1]) {
                swapper = numbers[n];
                numbers[n] = numbers[n+1];
                numbers[n+1] = swapper;
                n--;
                if (n < 0) break;
            }
        }

        int sum = 0;
        for (int k = 1; k < (numbers.length - 1); k++) {
            sum = sum + numbers[k];
        }

        return sum;
    }
}
