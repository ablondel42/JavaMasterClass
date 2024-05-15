package Section_6.Exercice_24;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        number = reverse(number);
        while (digitCount > 0) {
            int lastDigit = number % 10;
            switch (lastDigit) {
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("Zero");
            }
            number /= 10;
            digitCount--;
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        String tmp;

        if (number < 0) {
            number *= -1;
        }
        String[] s = String.valueOf(number).split("");
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
        String result = String.join("", s);
        int finalNumber = Integer.parseInt(result);
        if (isNegative) {
            finalNumber *= -1;
        }
        return finalNumber;
    }

    public static int getDigitCount(int number) {
        return (number >= 0) ? String.valueOf(number).length() : -1;
    }
}
