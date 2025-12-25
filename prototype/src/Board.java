public class Board implements Cloneable {

    public static final int NO_OF_ROWS = 8;
    public static final int NO_OF_COLUMNS = 8;

    private Cell[][] board;


    public Board() {
        board = new Cell[NO_OF_ROWS][NO_OF_COLUMNS];

        for (int row = NO_OF_ROWS - 1; row >= 0; row--) {
            for (int col = NO_OF_COLUMNS - 1; col >= 0; col--) {
                if ((row + col) % 2 == 0)
                    board[row][col] = new Cell("WHITE");
                else
                    board[row][col] = new Cell("BLACK");
            }
        }
    }

    public void print() {
        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int j = 0; j < NO_OF_COLUMNS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public Object clone() {
        Board copy;
        try {

            copy = (Board) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }


        copy.board = new Cell[NO_OF_ROWS][NO_OF_COLUMNS];
        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int j = 0; j < NO_OF_COLUMNS; j++) {
                copy.board[i][j] = (Cell) this.board[i][j].clone();
            }
        }

        return copy;
    }
}
