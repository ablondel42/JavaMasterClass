package ControlFlow.FirstLastDigitSum;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            String s = String.valueOf(number);
            return Integer.parseInt(s.substring(0, 1)) +
                    Integer.parseInt(s.substring(s.length() - 1));
        }
        return -1;
    }
}
