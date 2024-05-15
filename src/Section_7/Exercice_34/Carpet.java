package Section_7.Exercice_34;

public class Carpet {
    private final double cost;

    public Carpet(double cost) {
        this.cost = cost > 0 ? cost : 0;
    }

    public double getCost() {
        return cost;
    }
}
