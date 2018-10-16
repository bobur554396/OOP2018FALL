package Example2;

public class Cat extends Animal {

    public Cat(){ };

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void showConstant() {
        System.out.println(MyRunnable.VAL);
    }

    @Override
    public void showNumber() {
        System.out.println(MyRunnable.sum(2, 3));
    }

    @Override
    public void run() {

    }

}
