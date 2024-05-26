package ControlFlow.LargestPrime;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        boolean isPrime;

        if (number < 0) {
            return -1;
        }
        for (int i = number; i >= 2; i--) {
            isPrime = true;
            int j = i - 1;
            for (; j >= 2; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && number % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
