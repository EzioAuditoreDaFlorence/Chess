package ChessPiece;

public class Pawn extends Piece{
    Type type = Type.PAWN;

    public Pawn(int x, int y, Type type, boolean isWhite) {
        super(x, y, isWhite);
    }
}
