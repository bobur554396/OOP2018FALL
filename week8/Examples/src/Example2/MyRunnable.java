package Example2;

public interface MyRunnable {
    int VAL = 1;

    void run();
    void showConstant();

    default void showNumber(){
        System.out.println("test");
    }

    static int sum(int a, int b){
        return a + b;
    }
}
