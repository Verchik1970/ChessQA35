abstract class ChessPiece {
    String color;
    Boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return (color);
    }

    abstract String getSymbol();

    public int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public int getMin(int a, int b) {
        return Math.min(a, b);
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }


    public boolean canMoveToPosition(ChessBoard chessBoard, int line,
                                     int column, int toLine, int toColumn) {
        return false;
    }
}

