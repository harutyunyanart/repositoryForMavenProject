package inheritanceChange.figure;

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
        JButton moveButton = new JButton("MOVE");
        JButton deleteButton = new JButton("DELETE");
        JButton startButton = new JButton("START");
        JButton pauseButton = new JButton("PAUSE");
        JButton resumeButton = new JButton("CONTINUE");
        controlPanel.add(addButton);
        controlPanel.add(resumeButton);
        controlPanel.add(deleteButton);
        controlPanel.add(startButton);
        controlPanel.add(pauseButton);
        controlPanel.add(moveButton);
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
               // Figure figure = canvas.getFigures().get(canvas.getFigures().size() - 1);
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
                Figure figure = canvas.getFigures().get(canvas.getFigures().size() - 1);
               canvas.start();
            }
        });
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Figure figure = canvas.getFigures().get(canvas.getFigures().size() - 1);
               canvas.pause();
            }
        });

        resumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Figure figure = canvas.getFigures().get(canvas.getFigures().size() - 1);
                canvas.resume();
            }
        });



    }

    public static void main(String[] args) {
        new FigureFrame();
    }

}
