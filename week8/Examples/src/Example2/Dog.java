package Example2;

public class Dog extends Animal implements Comparable{

    public Dog(){}

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void run() {

    }

    @Override
    public void showNumber() {

    }

    @Override
    public void showConstant() {

    }
}
