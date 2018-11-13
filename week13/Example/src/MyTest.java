import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyTest {

    static void f1() throws FileNotFoundException{
        RandomAccessFile file = new RandomAccessFile(new File("test.txt"), "r");
    }

    static void f2() throws NotFiveException {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(new File("test.txt"), "r");
            int a = file.read() - '0';
            if(a != 5)
                throw new NotFiveException();


        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block");
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String args[]){
        try {
            f2();
        } catch (NotFiveException e) {
            System.out.println(e.getMessage());
        }


        //        try {
//            f1();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}


class NotFiveException extends Exception{

    @Override
    public String getMessage() {
        return "read integer != 5";
    }
}
