//import Folder.*;
//import Folder2.*;
import Folder2.Class1;

public class Body {
    private long idNum;
    private String name = "empty";
    private Body orbits;
    private static long nextID = 0;
    private Class1 c1;

//    {
//        System.out.println("Init block 1");
//    }
//
//    {
//        System.out.println("Init block 2");
//    }
//
//    {
//        System.out.println("Init block 3");
//    }

//    static {
//        System.out.println("static init block");
//    }

    public Body(){
//        System.out.println("Constructor 1");
        idNum = ++nextID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        name = n;
    }


}