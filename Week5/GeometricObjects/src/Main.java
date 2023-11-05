public class Main {

    public static void main(String[] args) {

        var run = new GeometricShapeCollection(10);
        boolean end = true;

        while (end) {
            end = run.runMenu();
        }
    }
}