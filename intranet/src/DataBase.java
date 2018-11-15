import java.io.*;
import java.util.HashMap;
import java.util.Vector;

public class DataBase {

    public static Vector<Student> students = new Vector<Student>();

    public void doSerialize() {
        ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(new FileOutputStream("students"));
            output.writeObject(students);
            output.flush();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doDeSerialize() {
        RandomAccessFile rafStudents;
        ObjectInputStream input;
        try {
            rafStudents = new RandomAccessFile(new File("students"), "rw");

            if (rafStudents.length() != 0) {
                input = new ObjectInputStream(new FileInputStream(new File("students")));
                students = (Vector<Student>) input.readObject();
                input.close();
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }


}

