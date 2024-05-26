package Polymorphism.Encapsulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    private final Printer printer = new Printer(50, true);

    @Test
    void addToner() {
        printer.addToner(50);
        assertEquals(100, printer.getTonerLevel());
    }

    @Test
    void getPagesPrinted() {
        assertEquals(0, printer.getPagesPrinted());
        printer.printPages(4);
        assertEquals(2, printer.getPagesPrinted());
        printer.printPages(2);
        assertEquals(3, printer.getPagesPrinted());
    }
}