package piece;

import main.GamePanel;

public class King extends Piece {

    public King(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE){
            getImage("/piece/w_king");
        } else {
            getImage("/piece/b_king");
        }
    }
}
