package piece;

import main.GamePanel;

public class Horse extends Piece{

    public Horse(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE){
            getImage("/piece/w_horse");
        } else {
            getImage("/piece/b_horse");
        }
    }
}