package Section_8.Exercice_39;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel: -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }
        int tempAmount = tonerLevel + tonerAmount;

        if (tempAmount < 0 || tempAmount > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("Printer in duplex mode");
        } else {
            System.out.println("Printer in regular mode");
        }
        int printed = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += printed;
        return printed;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
