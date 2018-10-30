import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.*;
import java.util.RandomAccess;
import java.util.StringTokenizer;

public class MyTest {

    static void f1(){
        try {
            FileReader in_file = new FileReader("test.txt");
            FileWriter out_file = new FileWriter("test_out.txt");

            BufferedReader br = new BufferedReader(in_file);
            BufferedWriter bw = new BufferedWriter(out_file);


            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                bw.write(line +"\n");
                line = br.readLine();
            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void f2(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

            String line = br.readLine();
            while (!line.equals("q")){
                System.out.println(line);
                bw.write(line);
                line = br.readLine();
            }

            br.close();
            bw.close();
        } catch (Exception e){
            System.out.println("error");
        }
    }

    static void f3(){
        try {
            FileOutputStream file_out = new FileOutputStream("s_out.ser");
            ObjectOutputStream oos = new ObjectOutputStream(file_out);

            Student s = new Student("student1");

            s.incAge();
            s.incAge();


            oos.writeObject(s);
            oos.flush();
            oos.close();
        } catch (Exception e){
            System.out.println("error");
        }
    }

    static void f4(){
        try {
            FileInputStream file_in = new FileInputStream("s_out.ser");
            ObjectInputStream ois = new ObjectInputStream(file_in);

            Student s = (Student) ois.readObject();
            System.out.println(s);

            ois.close();
        } catch (Exception e){
            System.out.println("error");
        }
    }

    public static void main(String args[]){
        f4();
    }
}
