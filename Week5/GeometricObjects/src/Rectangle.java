public class Rectangle extends GeometricObject {

    protected double length;
    protected double width;

    public Rectangle() {}

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public Rectangle(double l, double w, String color, boolean filled) {
        super(color, filled);
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Shape: " + getShape() + ", length: " + length + ", width: " + width
                + ", area: " + getArea() + ", perimeter: " + getPerimeter() + ", color: " + getColor();
    }
}
