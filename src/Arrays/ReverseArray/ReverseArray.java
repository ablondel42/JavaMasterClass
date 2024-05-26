package Arrays.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int tmp;

        System.out.println("Array = " + Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
