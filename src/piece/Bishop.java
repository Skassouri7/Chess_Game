package piece;

import main.GamePanel;

public class Bishop extends Piece{

    public Bishop(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE){
            getImage("/piece/w_bishop");
        } else {
            getImage("/piece/b_bishop");
        }
    }
}
