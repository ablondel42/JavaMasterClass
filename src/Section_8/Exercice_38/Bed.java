package Section_8.Exercice_38;

public class Bed {
    private final String style;
    private final int pillows;
    private final int height;
    private final int sheets;
    private final int quilt;

    public Bed(
            String style,
            int pillows,
            int height,
            int sheets,
            int quilt
    ) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.print("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
