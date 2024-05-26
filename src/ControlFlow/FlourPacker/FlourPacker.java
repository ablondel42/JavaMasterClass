package ControlFlow.FlourPacker;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 >= goal) {
            return smallCount >= goal % 5;
        } else {
            return smallCount >= goal - bigCount * 5;
        }
    }
}
