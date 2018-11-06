// Gender -- male, female

enum Gender {
    MALE,
    FEMALE
}

public class Student {
    String name;
    int age;
    Gender gender;

    public Student (String n, int a, Gender g){
        name = n;
        age = a;
        gender = g;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
