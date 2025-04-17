package main;

import piece.Piece;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    private static final int WIDTH = 1100;
    private static final int HEIGHT = 800;
    private static final int FPS = 60;
    private Thread gameThread;
    private Board board = new Board();

    public static final int WHITE = 0;
    private static final int BLACK = 1;
    private int currentColour = WHITE;

    

    public GamePanel(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.GRAY);
    }

    public void launchGame(){

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){

        //Our Game loop
        double drawInterval = 1000000000d/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null){
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1){
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        board.draw((Graphics2D) g);
    }
}
