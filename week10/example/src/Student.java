import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;

    public Student(String n){
        name = n;
        age = 18;
    }

    public void incAge(){
        ++age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
