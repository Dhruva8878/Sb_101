package ass_2;

public class Student {

    private Integer roll;
    private String name;
    private Integer marks;

    Student(){};
    public Student(Integer roll, String name, Integer marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Integer getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }
}
