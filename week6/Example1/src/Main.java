import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<AbstractShape> shapes = new ArrayList<>();

        shapes.add(new Circle());
        shapes.add(new Square());

        for(int i = 0; i < shapes.size(); i++){
            shapes.get(i).draw(new Canvas());
        }

    }
}
