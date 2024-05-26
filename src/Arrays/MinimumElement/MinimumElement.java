package Arrays.MinimumElement;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[n];

        for(int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
