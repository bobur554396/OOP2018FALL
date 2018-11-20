import java.awt.*;

class MyThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if(i > 5) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable2 implements Runnable{
    public boolean isRunning = true;
    public int cnt = 0;

    public void stopRun(){
        this.isRunning = false;
    }

    public boolean isRunning(){
        return this.isRunning ;
    }

    @Override
    public void run() {
        while (isRunning()){
            System.out.println(Thread.currentThread().getName() +": "+cnt);
            cnt++;
        }
    }
}

public class MyTest {

    static void f1(){
        System.out.println("Main thread started");
        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();
        thread.start();
        thread2.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread ended");
    }

    static void f2(){
        MyRunnable my_r = new MyRunnable();
        Thread t1 = new Thread(my_r);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(my_r);
        t2.start();
    }

    static void f3(){
        System.out.println("Main thread started");
        MyRunnable2 my_r = new MyRunnable2();
        Thread t1 = new Thread(my_r);
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        my_r.stopRun();
        System.out.println("Main thread ended");
    }

    public static void main(String args[]){
        f3();
    }
}
