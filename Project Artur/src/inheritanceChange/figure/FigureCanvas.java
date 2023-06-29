package inheritanceChange.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import static java.awt.Cursor.*;

public class FigureCanvas extends JPanel {

    private ArrayList<Figure> figures = new ArrayList<>();
    private int mX;
    private int mY;

    private boolean isSelected;

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public FigureCanvas() {
        setBackground(Color.CYAN);
        FigureCanvas canvas = this;
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isSelected) {
                    Figure lastFigure = figures.get(figures.size() - 1);
                    switch (getCursor().getType()) {
                        case DEFAULT_CURSOR:
                            lastFigure.setX(lastFigure.x + e.getX() - mX);
                            lastFigure.setY(lastFigure.y + e.getY() - mY);
                            mX = e.getX();
                            mY = e.getY();
                            repaint();
                            break;
                        case NW_RESIZE_CURSOR:
                            int changeX = e.getX() - mX;
                            int changeY = e.getY() - mY;
                            lastFigure.setX(lastFigure.x + changeX);
                            lastFigure.setY(lastFigure.y + changeY);
                            lastFigure.setWidth(lastFigure.width - changeX);
                            lastFigure.setHeight(lastFigure.height - changeY);
                            mX = e.getX();
                            mY = e.getY();
                            repaint();
                            break;
                        case NE_RESIZE_CURSOR:
                            changeX = e.getX() - mX;
                            changeY = mY - e.getY();
                            lastFigure.setX(lastFigure.x);
                            lastFigure.setY(lastFigure.y - changeY);
                            lastFigure.setWidth(lastFigure.width + changeX);
                            lastFigure.setHeight(lastFigure.height + changeY);
                            mX = e.getX();
                            mY = e.getY();
                            repaint();
                            break;

                        case SW_RESIZE_CURSOR:
                            changeX = mX - e.getX();
                            changeY = e.getY() - mY;
                            lastFigure.setX(lastFigure.x - changeX);
                            lastFigure.setY(lastFigure.y);
                            lastFigure.setWidth(lastFigure.width + changeX);
                            lastFigure.setHeight(lastFigure.height + changeY);
                            mX = e.getX();
                            mY = e.getY();
                            repaint();
                            break;

                        case SE_RESIZE_CURSOR:
                            changeX = e.getX() - mX;
                            changeY = e.getY() - mY;
                            lastFigure.setX(lastFigure.x);
                            lastFigure.setY(lastFigure.y);
                            lastFigure.setWidth(lastFigure.width + changeX);
                            lastFigure.setHeight(lastFigure.height + changeY);
                            mX = e.getX();
                            mY = e.getY();
                            repaint();
                            break;


                    }
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mouseMovedPerformed(e);
            }


        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //
                //setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
                mX = e.getX();
                mY = e.getY();
                for (int i = figures.size() - 1; i >= 0; i--) {
                    if (figures.get(i).isBelong(mX, mY)) {
                        Figure figure = figures.remove(i);
                        figures.add(figure);
                        isSelected = true;
                        update(canvas.getGraphics());
                        return;
                    }
                }
                isSelected = false;
            }
        });

    }

    private void mouseMovedPerformed(MouseEvent e) {
        int mX = e.getX();
        int mY = e.getY();
        for (Figure figure : figures) {
            Cursor cursor = figure.getCorrespondingCursor(mX, mY);
            if (cursor != Cursor.getDefaultCursor()) {
                setCursor(cursor);
                return;
            }
        }
        setCursor(Cursor.getDefaultCursor());
    }

    public void addFigure() {
        Random generator = new Random();
        int x = generator.nextInt(500);
        int y = generator.nextInt(100, 300);
        int width = generator.nextInt(100);
        int height = generator.nextInt(100);
        boolean isRectangle = generator.nextBoolean();
        int r = generator.nextInt(256);
        int g = generator.nextInt(256);
        int b = generator.nextInt(256);
        Color color = new Color(r, g, b);
        if (isRectangle) {
            figures.add(new Rectangle(x, y, width, height, color, this));
        } else {
            figures.add(new Rectangle(x, y, width, height, color, this));
            //figures.add(new Circle(x, y, width, color, this));
        }
    }


    public void delete() {
        if (figures.size() > 0) {
            Figure figure = figures.get(figures.size() - 1);
            {
                figures.remove(figure);
                update(getGraphics());
            }
        }
    }

    public Figure getSelected() {
        int size = figures.size();
        return isSelected && size > 0 ? figures.get(size - 1) : null;
    }

    public void start() {
        if (isSelected) {
            getSelected().start();
        }

    }
    public void pause() {
        if (isSelected) {
            getSelected().pause();
        }
    }
    public void move() {
        if (isSelected) {
            getSelected().move();
        }
    }
    public void resume() {
        if (isSelected) {
            getSelected().resume();
        }
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }

}
