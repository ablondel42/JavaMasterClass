package Section_5.Exercice_10;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long years = minutes / 60 / 24 / 365;
        long days = (minutes / 60 / 24) % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
