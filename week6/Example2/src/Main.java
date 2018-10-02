import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
//        ArrayList<AbstractShape> shapes = new ArrayList<>();
//
//        shapes.add(new Circle());
//        shapes.add(new Square());
//
//        for(int i = 0; i < shapes.size(); i++){
//            shapes.get(i).draw(new Canvas());
//        }
//
//        for(int i = 0; i < shapes.size(); i++){
//            System.out.println(shapes.get(i).findArea());
//        }
        Person p1 = new Person();
        Person p2 = new Person();

        if(p1.equals(p2)){
            System.out.println(p1);
        }


    }
}
