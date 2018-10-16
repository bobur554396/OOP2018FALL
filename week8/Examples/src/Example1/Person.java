package Example1;

public class Person implements ClonableComparable {
    String name;

    @Override
    public int compareTo(Object o) {
//        this == o
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = new Person();
        p.name = this.name;
//        String n = new String(this.name);
//        p.name = n;
        return p;
    }

    @Override
    public void test() {

    }
}
