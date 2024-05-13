package Section_5.Exercice_3;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return ;
        }
        System.out.println(
                kiloBytes + " KB = " + kiloBytes / 1024 +
                " MB and " + kiloBytes % 1024 + " KB"
        );
    }
}
