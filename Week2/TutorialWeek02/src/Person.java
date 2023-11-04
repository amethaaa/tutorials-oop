public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }
    public void displayName() {
        System.out.println("Name: " + name);
    }
}