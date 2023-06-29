package inheritance.figure;

//import exceptions.IllegalHumanAgeException;

import java.awt.*;

public class Rectangle extends Figure {
//    protected int x;


    public Rectangle(int x, int y, int width, int height, FigureCanvas canvas) {
        this(x, y, width, height, Color.BLACK, canvas);
    }

    public Rectangle(int x, int y, int width, int height, Color color, FigureCanvas canvas) {
        super(x, y, width, height, color, canvas);
    }

    protected int getSuperX() {
        return super.x;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public int getDiagonal() {
        return 0;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle that = (Rectangle) o;
        if (that.x != this.x || that.y != this.y) {
            return false;
        }
        return (this.getWidth() == that.getWidth()
                && that.getHeight() == this.getHeight())
                || (this.getWidth() == that.getHeight()
                && this.getHeight() == that.getWidth());
    }

    public boolean isBelong(int mX, int mY) {
        return mX >= x - 5 && mX <= x + width + 5
                && mY >= y - 5 && mY <= y + height + 5;
    }

    public Cursor getCorrespondingCursor(int mX, int mY) {
        if (mX <= x && mX > x - 5 && mY <= y && mY > y - 5) {
            return Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR);
        }
        if (mX >= x + width && mX < x + width + 5 && mY <= y && mY > y - 5) {
            return Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR);
        }

        if (mY >= y + height && mY < y + height + 5 && mX <= x && mX > x - 5) {
            return Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR);
        }
        if (mX >= x + width && mX < x + width + 5 && mY >= y + height && mY > y + height - 5) {
            return Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR);
        }
        return Cursor.getDefaultCursor();
    }

    @Override
    public void draw(Graphics graphics) {


        graphics.setColor(getColor());
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());
    }

}
