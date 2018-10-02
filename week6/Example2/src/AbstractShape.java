import java.awt.*;

public abstract class AbstractShape {
    Color color;
    Point location;

    public void diIt(){}
    public abstract double findArea();
    public abstract void draw(Canvas c);
    public abstract void move(int dx, int dy);

}
