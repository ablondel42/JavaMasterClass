package Section_5.Exercice_6;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        return ((long)(d1 * 1000) == (long)(d2 * 1000));
    }
}
