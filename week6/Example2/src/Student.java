public class Student extends Person {
    double gpa;

    @Override
    public String toString() {
        return super.toString() + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if(super.equals(obj)){
            if(this.gpa == s.gpa){
                return true;
            }
        }
        return false;
    }
}
