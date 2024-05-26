package Inheritance.Point;

public class Point {
    private int x;
    private int y;

    public Point() {};

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(
                Math.pow(0.0 - this.x, 2.0) + Math.pow(0.0 - this.y, 2.0)
        );
    }

    public double distance(Point b) {
        return Math.sqrt(
                Math.pow(b.x - this.x, 2.0) + Math.pow(b.y - this.y, 2.0)
        );
    }

    public double distance(int x, int y) {
        return Math.sqrt(
                Math.pow(x - this.x, 2.0) + Math.pow(y - this.y, 2.0)
        );
    }
}
