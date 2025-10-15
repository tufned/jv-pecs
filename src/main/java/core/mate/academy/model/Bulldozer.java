package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private int ripperTeethCount;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getRipperTeethCount() {
        return ripperTeethCount;
    }

    public void setRipperTeethCount(int ripperTeethCount) {
        this.ripperTeethCount = ripperTeethCount;
    }
}
