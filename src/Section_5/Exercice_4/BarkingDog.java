package Section_5.Exercice_4;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay >= 0 && hourOfDay <= 23)) {
            return hourOfDay > 22 || hourOfDay < 8;
        }
        return false;
    }
}
