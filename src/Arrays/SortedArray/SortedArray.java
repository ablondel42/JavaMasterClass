package Arrays.SortedArray;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {
    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        int[] dest = new int[size];

        for (int i = 0; i < size; i++) {
            dest[i] = sc.nextInt();
        }
        return dest;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int tmp;
        int[] cpy = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i + 1 < arr.length; i++) {
            if (cpy[i] < cpy[i + 1]) {
                tmp = cpy[i];
                cpy[i] = cpy[i + 1];
                cpy[i + 1] = tmp;
                i = -1;
            }
        }
        return cpy;
    }
}
