package Section_7.Exercice_37;

public class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
