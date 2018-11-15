import java.io.Serializable;

public class Student implements Serializable {
    public String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + this.name;
    }
}
