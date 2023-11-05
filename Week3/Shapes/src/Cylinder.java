import com.codewithametha.Circle;
public class Cylinder extends Circle {

    private double height = 1;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * getRadius() * height) + (2 * Math.PI * getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}
