public class Square extends GeometricObject {

    protected double side;

    public Square() {}

    public Square(double s) {
        side = s;
    }

    public Square(double s, String color, boolean filled) {
        super(color, filled);
        side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Shape: " + getShape() + ", side: " + side + ", area: " + getArea() +
                ", perimeter: " + getPerimeter()+ ", color: " + getColor();
    }
}
