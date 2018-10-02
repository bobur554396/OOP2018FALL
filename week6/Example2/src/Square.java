import java.awt.*;

public class Square extends AbstractShape {
    private double side;

    @Override
    public void draw(Canvas c) {
        System.out.println("Square draw function");
    }

    @Override
    public void move(int dx, int dy) {

    }

    @Override
    public double findArea() {
        return side * side;
    }
}
