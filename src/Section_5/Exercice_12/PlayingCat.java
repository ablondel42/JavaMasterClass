package Section_5.Exercice_12;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        }
        return temperature >= 25 && temperature <= 35;
    }
}
