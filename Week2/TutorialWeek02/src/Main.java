public class Main {

    public static void main(String[] args) {

        var personOne = new Person("Ben");
        personOne.setSurname("Hopkins");
        personOne.setAge(32);
        printInfo(personOne);
        var personTwo = new Person("Tyler");
        personTwo.setSurname("Durden");
        personTwo.setAge(28);
        printInfo(personTwo);
        var personThree = new Person("James");
        personThree.setSurname("May");
        personThree.setAge(54);
        printInfo(personThree);
    }

    public static void printInfo(Person p) {
        p.displayName();
        System.out.println("Surname: " + p.getSurname());
        System.out.println("Age: " + p.getAge());
    }
}