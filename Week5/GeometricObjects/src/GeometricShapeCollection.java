import java.util.ArrayList;
import java.util.Scanner;
public class GeometricShapeCollection implements ShapeCollection {

    private ArrayList<GeometricObject> objects;
    private int max;

    public GeometricShapeCollection(int numOfObjects) {
        this.max = numOfObjects;
        objects = new ArrayList<>();
    }
    @Override
    public void addShape(GeometricObject shape) {
        if (max < objects.size())
            objects.add(shape);
        else System.out.println("No more space in the list");
    }

    @Override
    public void printShapeList() {
        for (int i = 0; i < objects.size(); i++)
            System.out.println(objects);
    }

    @Override
    public boolean runMenu() {

        boolean end = false;
        var input = new Scanner(System.in);

        System.out.print("""
                To add a new shape press 1
                To print the list of shapes press 2
                To exit press 3
                Choice:\s""");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.print("""
                        Press 1 to add a circle
                        Press 2 to add a rectangle
                        Press 3 to add a square
                        Choice:\s""");

                int action = input.nextInt();

                System.out.print("Enter color of the shape: ");
                String color = input.next();
                System.out.println("Is the shape filled? (y/n)");
                String pick = input.next();

                boolean isFilled;
                if (pick.equals("y"))
                    isFilled = true;
                else
                    isFilled = false;

                if (action == 1) {
                    System.out.print("Radius: ");
                    int radius = input.nextInt();

                    var c = new Circle(radius,color,isFilled);
                    addShape(c);
                }
                else if(action ==2) {
                    System.out.print("Length:");
                    int length = input.nextInt();

                    System.out.print("Width: ");
                    int width = input.nextInt();

                    var r = new Rectangle(length,width,color,isFilled);
                    addShape(r);
                }
                else if(action == 3) {
                    System.out.print("Side: ");
                    int side = input.nextInt();

                    var s = new Square(side,color,isFilled);
                    addShape(s);
                }
                break;
            case 2:
                printShapeList();
                break;
            case 3:
                end = true;
                break;
        }
        return end;
    }
}
