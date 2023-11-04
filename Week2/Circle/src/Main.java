public class Main {

    public static void main(String[] args) {

       var circle1 = new Circle();
       System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " +
               circle1.getArea() + "and is " + circle1.getColor() + " color");
       var circle2 = new Circle(8);
       System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
               circle2.getArea() + "and is " + circle2.getColor() + " color");
       var circle3 = new Circle(6,"Red");
       System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " +
               circle3.getArea() + "and is " + circle3.getColor() + " color");
       circle3.setRadius(5);
       circle3.setColor("Orange");
       System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " +
               circle3.getArea() + "and is " + circle3.getColor() + " color");
    }
}