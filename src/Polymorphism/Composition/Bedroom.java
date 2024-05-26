package Polymorphism.Composition;

public class Bedroom {
    private final Bed bed;
    private final Lamp lamp;

    public Bedroom(
            String name,
            Wall wall1,
            Wall wall2,
            Wall wall3,
            Wall wall4,
            Ceiling ceiling,
            Bed bed,
            Lamp lamp
    ) {
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}
