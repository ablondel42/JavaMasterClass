package Section_6.Exercice_23;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        if (number < 1)
            return false;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
