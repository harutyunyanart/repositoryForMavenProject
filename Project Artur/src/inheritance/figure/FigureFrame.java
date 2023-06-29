package inheritance.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FigureFrame extends JFrame {
    public static int frameWidth = 1000;
    public static int frameHeight = 800;

    public FigureFrame() {
        FigureCanvas canvas = new FigureCanvas();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(frameWidth, frameHeight);
        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("ADD");
        JButton continueButton = new JButton("CONTINUE");
        JButton deleteButton = new JButton("DELETE");
        JButton startButton = new JButton("START");
        JButton pauseButton = new JButton("PAUSE");
        controlPanel.add(addButton);
        controlPanel.add(continueButton);
        controlPanel.add(deleteButton);
        controlPanel.add(startButton);
        controlPanel.add(pauseButton);
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
        continueButton.addActionListener(new ActionListener() {
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
                canvas.pause();
            }
        });

    }

    public static void main(String[] args) {
        new FigureFrame();
    }

}
