package piece;

import main.GamePanel;

public class Queen extends Piece{

    public Queen(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE){
            getImage("/piece/w_queen");
        } else {
            getImage("/piece/b_queen");
        }
    }
}
