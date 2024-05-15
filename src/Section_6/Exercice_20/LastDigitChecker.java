package Section_6.Exercice_20;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        return (a1 == b1 || a1 == c1 || b1 == c1);
    }

    public static boolean isValid(int n) {
        return (n >= 10 && n <= 1000);
    }
}
