import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;


public class Driver {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static GregorianCalendar gr = new GregorianCalendar();
    private static DataBase database = new DataBase();

    private static boolean isAdmin(String rootName, String password){
        return rootName.equals("Bobur") && password.equals("123");
    }

    private static void makeLog(String message){
        try {
            RandomAccessFile raf = new RandomAccessFile("log.txt", "rw");
            String ss = "\n" + new Date() + " " + message + "\n";
            raf.seek(raf.length());
            raf.writeBytes(ss);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void exit(){
        System.out.println("Bye!");
        database.doSerialize();
    }

    public static void main(String[] args) throws IOException {
        database.doDeSerialize();

        menu: while (true) {
            System.out.println("Welcome to our Intranet!!! \nAre you admin or student ...");
            System.out.println(" 1) Admin \n 2) Student \n 3) Exit");
            int choice = Integer.parseInt(in.readLine());
            if (choice == 1) {
                admin_part: while (true) {
                    String rootName, password;
                    System.out.println("Hello admin");
                    System.out.println("Enter name: ");
                    rootName = in.readLine();
                    System.out.println("Enter password: ");
                    password = in.readLine();
                    if (isAdmin(rootName, password)) {
                        makeLog("admin logged in to a system");
                        System.out.println("Welcome " + rootName + " !!!");
                        inAdmin: while (true) {
                            System.out.println(" 1) Add Students \n 2) View Students \n 3) Exit");
                            choice = Integer.parseInt(in.readLine());
                            if (choice == 1) {
                                String name;
                                System.out.println("Write name of student");
                                name = in.readLine();
                                Student s = new Student(name);
                                DataBase.students.add(s);
                                System.out.println("Student added!");
                                makeLog("admin added new Student: "+name);
                                continue inAdmin;
                            } else if (choice == 2) {
                                for(Student s : DataBase.students)
                                    System.out.println(s);
                                continue inAdmin;
                            } else if (choice == 3) {
                                exit();
                                break menu;
                            }
                        }
                    } else {
                        System.out.println("Bad root name or password!!!\n");
                        System.out.println(" 1) Try again \n 2) Return back  \n 3) Exit");
                        bad_admin : while(true){
                            choice = Integer.parseInt(in.readLine());
                            if(choice==1) continue admin_part;
                            if(choice==2) continue menu;
                            if(choice==3) {
                                makeLog("admin log out from system");
                                break menu;
                            }
                        }
                    }
                }
            } else if(choice == 2){
                // Student part
                System.out.println("Student part");
            } else if(choice == 3){
                exit();
                break menu;
            }

        }
    }

}
