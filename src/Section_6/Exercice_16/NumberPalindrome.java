package Section_6.Exercice_16;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        StringBuilder rev = new StringBuilder();
        int n = Math.abs(number);
        String toCmp = "" + n;

        while (n >= 10) {
            rev.append(n % 10);
            n /= 10;
        }
        rev.append(n % 10);
        return  (toCmp.contentEquals(rev));
    }
}
