package ControlFlow.GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            for (int i = Math.min(first, second); i >= 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
