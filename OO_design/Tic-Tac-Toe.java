//deisgn a TicTacToe game. with the method move(). move returns which player wins after this move. 
public class TicTacToe {
    private int[] rows;
    private int[] cols;
    private int diagonal;
    private int antiDiagonal;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int count= player==1?1:-1;
        rows[row]+=count;
        cols[col]+=count;
        if(row==col)diagonal+=count;
        if(row==rows.length-1-col)antiDiagonal+=count;
        int n= rows.length;
        if (Math.abs(rows[row]) == n ||
        Math.abs(cols[col]) == n ||
        Math.abs(diagonal) == n  ||
        Math.abs(antiDiagonal) == n)return player;
        return 0;
    }
}
