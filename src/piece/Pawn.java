package piece;

import main.GamePanel;

public class Pawn extends Piece {
    private int color, col, row;

    public Pawn(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE){
            getImage("/piece/w_pawn");
        } else {
            getImage("/piece/b_pawn");
        }
    }
}
