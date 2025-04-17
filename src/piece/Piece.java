package piece;

import java.awt.image.BufferedImage;
import java.io.IOException;

import main.Board;

import javax.imageio.ImageIO;

public class Piece {

    private BufferedImage image;
    private int x, y;
    private int col, row, preCol, preRow;
    private int color;

    public Piece(int color, int col, int row ) {

        this.col = col;
        this.row = row;
        this.color = color;
        x = getCol();
        y = getRow();
        preCol = col;
        preRow = row;
    }

    public BufferedImage getImage(String imagePath){
        BufferedImage image = null;

        try{
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return image;
    }

    public int getCol() {
        return col * Board.SQUARE_SIZE;
    }

    public int getRow() {
        return row;
    }
}
