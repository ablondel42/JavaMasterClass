package Section_6.Exercice_27;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return ;
        }
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if ((row == 0 || col == 0 || row == number - 1 || col == number - 1) ||
                        (row == col) || (col == number - 2 - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
