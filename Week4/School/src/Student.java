public class Student extends Person {

    private int IDNumber;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender, int IDNo) {
        super(name, age, gender);
        IDNumber = IDNo;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public double getFee() {
        return fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setIDNumber(int IDNo) {
        IDNumber = IDNo;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID No: " + IDNumber + ", fee: " + fee + ", grade: " + grade;
    }
}
