package ChessPiece;

public class Rook extends Piece{
    Type type = Type.ROOK;

    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }
    
    @Override
    boolean canMove(int target_x,int y) {
        if (target_x != this.x) return false;
        return true;
    }
}
