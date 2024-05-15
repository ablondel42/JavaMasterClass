package Section_6.Exercice_19;

public class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        int c1 = n1 / 10;
        int c2 = n1 % 10;
        int c3 = n2 / 10;
        int c4 = n2 % 10;

        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
            return false;
        }

        return (c1 == c3 || c1 == c4) || (c2 == c3 || c2 == c4);
    }
}
