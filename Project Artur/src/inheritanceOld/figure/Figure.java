package inheritanceOld.figure;

import java.awt.*;
import java.util.Random;


public abstract class Figure implements Runnable {
    private final FigureCanvas canvas;
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    private Color color;
    private boolean isStarting = true;
    Random generator = new Random();
    int nextX = generator.nextBoolean() ? 1 : -1;
    int nextY = generator.nextBoolean() ? 1 : -1;
    int speed = generator.nextInt(1, 3);

    public Figure(int width, int height, FigureCanvas canvas) {
        this(10, 10, width, height, Color.BLUE, canvas);
    }

    public Figure(int x, int y, int width, int height, Color color, FigureCanvas canvas) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.canvas = canvas;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    protected abstract double getArea();

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Figure that = (Figure) o;
        if (that.x != this.x || that.y != this.y) {
            return false;
        }
        return (this.width == that.width
                && that.height == this.height)
                || (this.width == that.height
                && this.height == that.width);
    }

    public int hashCode() {
        return width * 31 * height * 31 * x * 31 * y * 31;
    }

    public String toString() {
        return getClass().getName() + " {" +
                "\n\tx: " + x +
                "\n\ty: " + y +
                "\n\twidth: " + width +
                "\n\theight: " + height +
                "\n}";
    }

    public void run() {
        int i = 0;
        while (isStarting) {
            setX(getX() + nextX);
            setY(getY() + nextY);
            i++;
            if (getY() == 0) {
                nextY = -nextY;
            }
            if (getX() == 0) {
                nextX = -nextX;
            }
            if (getX() + getWidth() == FigureFrame.frameWidth) {
                nextX = -nextX;
            }
            if (getY() + getHeight() == FigureFrame.frameHeight - 70) {
                nextY = -nextY;
            }
            canvas.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public abstract boolean isBelong(int x, int y);


    public abstract void draw(Graphics graphics);

    public Cursor getCorrespondingCursor(int mX, int mY) {
        return Cursor.getDefaultCursor();
    }
}
