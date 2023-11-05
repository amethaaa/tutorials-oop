import com.codewithametha.Circle;

public class Main {

    public static void main(String[] args) {
        var circle = new Circle(5);
        System.out.println(circle.getArea());

        var cylinder = new Cylinder(5,3);
        System.out.println(cylinder.getArea());
    }
}
