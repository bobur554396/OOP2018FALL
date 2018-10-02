public class Person {
    private int age;

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        if(this.age == p.age)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return this.age + "";
    }

}
