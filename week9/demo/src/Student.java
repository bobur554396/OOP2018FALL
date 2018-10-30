public class Student {
    private String name;

    public Student(String s){
        name = s;
    }

    @Override
    public String toString() {
        return "Student: " + this.name;
    }
}
