package Example2;

public abstract class Animal implements MyRunnable {
    String name;
    int age;

    public Animal(){};
    public Animal(String n, int a){
        name = n;
        age = a;
    }

    public abstract void run();
}
