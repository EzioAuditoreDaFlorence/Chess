package ChessPiece;

public abstract class Piece {
    int x,y;
    Type type;
    boolean isWhite;

    public Piece(int x, int y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    //check if this piece can move to target square
    boolean canMove(int target_row, int target_col) {

        return true;
    }
}
