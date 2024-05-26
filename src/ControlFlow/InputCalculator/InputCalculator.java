package ControlFlow.InputCalculator;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            String line = scanner.nextLine();
            try {
                int n = Integer.parseInt(line);
                sum += n;
                count++;
            } catch (Exception e) {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((float) sum / count));
                break ;
            }
        }
    }
}
