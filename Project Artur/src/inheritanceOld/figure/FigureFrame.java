package inheritanceOld.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FigureFrame extends JFrame {
    public static int frameWidth = 500;
   public static int frameHeight = 400;

    public FigureFrame() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(frameWidth, frameHeight);
        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("ADD");
        JButton moveButton = new JButton("MOVE");
        JButton deleteButton = new JButton("DELETE");
        JButton startButton = new JButton("START");
        JButton pauseButton = new JButton("PAUSE");
        controlPanel.add(addButton);
        controlPanel.add(moveButton);
        controlPanel.add(deleteButton);
        controlPanel.add(startButton);
        controlPanel.add(pauseButton);
        FigureCanvas canvas = new FigureCanvas();
        Container contentPane = getContentPane();
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(canvas, BorderLayout.CENTER);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.addFigure();
                contentPane.repaint();
            }
        });
        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.move();
            }
        });


        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.delete();
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.start();
            }
        });
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // canvas.pause();
            }
        });

    }

    public static void main(String[] args) {
        new FigureFrame();
    }

}
