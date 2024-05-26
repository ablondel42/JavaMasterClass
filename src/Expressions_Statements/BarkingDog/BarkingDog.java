package Expressions_Statements.BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay >= 0 && hourOfDay <= 23)) {
            return hourOfDay > 22 || hourOfDay < 8;
        }
        return false;
    }
}
