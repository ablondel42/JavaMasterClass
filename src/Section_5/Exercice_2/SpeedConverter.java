package Section_5.Exercice_2;

public class SpeedConverter {
    public long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return ;
        }
        System.out.println(
                kilometersPerHour +
                " km/h = " +
                toMilesPerHour(kilometersPerHour) +
                " mi/h"
        );
    }
}