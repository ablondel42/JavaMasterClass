package Expressions_Statements.PlayingCat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        }
        return temperature >= 25 && temperature <= 35;
    }
}
