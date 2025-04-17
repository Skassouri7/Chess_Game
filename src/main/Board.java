package main;

import java.awt.*;

public class Board {

    private static final int ROWS = 8;
    private static final int COLS = 8;
    public static final int SQUARE_SIZE = 100;

    public Board() {

    }

    public void draw(Graphics2D g){
        int c = 0;

        for (int i = 0; i < ROWS; i++){
            for(int k = 0; k < COLS; k++){
                if (c == 0){
                    g.setColor(Color.white);
                    c = 1;
                } else {
                    g.setColor(Color.BLACK);
                    c = 0;
                }
                g.fillRect(k * SQUARE_SIZE, i * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }
            if (c == 0){
                c = 1;
            } else {
                c = 0;
            }
        }
    }
}
