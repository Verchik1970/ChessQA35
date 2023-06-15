public class Pawn extends ChessPiece {
    public Pawn(String color) {

        super(color);
    }

    @Override
    public String getColor() {

        return super.getColor();
    }

    public String getSymbol() {
        return ("P");
    }

    @Override
    public int getMax(int a, int b) {
        return super.getMax(a, b);
    }

    @Override
    public int getMin(int a, int b) {
        return super.getMin(a, b);
    }

    @Override
    public boolean checkPos(int pos) {
        return super.checkPos(pos);
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn) && chessBoard.board[line][column] != null) {

            if (column == toColumn) { // проверяем что не хотим съесть
                int dir;
                int start;

                if (color.equals("White")) {  // для белых
                    dir = 1;
                    start = 1;
                } else { // для черных
                    dir = -1;
                    start = 6;
                }
//направление проверка
                if (line + dir == toLine) {
                    return chessBoard.board[toLine][toColumn] == null;
                }

                if (line == start && line + 2 * dir == toLine) {
                    return chessBoard.board[toLine][toColumn] == null && chessBoard.board[line + dir][column] == null; // check that positions is null
                }
// съедаем
            } else {

                if ((column - toColumn == 1 || column - toColumn == -1) && (line - toLine == 1 || line - toLine == -1) && // check that piece another color
                        chessBoard.board[toLine][toColumn] != null) {
                    return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                } else return false;
            }
        }
        return false;
    }
}

