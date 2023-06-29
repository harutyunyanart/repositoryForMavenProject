package inheritanceOld.figure;

import java.awt.*;

public class Circle extends Figure {

    private int radius;

    public Circle(int x, int y, int radius, FigureCanvas canvas) {
        this(x, y, radius, Color.BLACK, canvas);
    }

    public Circle(int x, int y, int radius, Color color, FigureCanvas canvas) {
        super(x, y, radius * 2, radius * 2, color, canvas);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean isBelong(int x, int y) {
        return false;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
