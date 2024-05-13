package Section_6.Exercice_18;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int n;

        if (number < 0) {
            return -1;
        }
        while (number >= 1) {
            n = number % 10;
            if (n % 2 == 0) {
                sum += n;
            }
            number /= 10;
        }
        return sum;
    }
}
