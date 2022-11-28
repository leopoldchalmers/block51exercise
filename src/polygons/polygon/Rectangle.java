package polygons.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Rectangle extends Polygon {
    public Rectangle(int x, int y) {
        super(x,y);
    }
    @Override
    public void paint(Graphics g){
        g.drawRect(getCenterPoint().x -20, getCenterPoint().y -10, 40, 20);
    }
}
