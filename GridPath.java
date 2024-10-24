public class GridPath {
    
    private int[][] grid;

    public GridPath(int[][] values) {

        grid = values;

    }

    public String toString() {

        String s = "";
        for (int[] row : grid){

            for (int col : row) {

                s += col + " ";
            }
            s += "\n";

        }
        return s;

    }


    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        int below = grid[row + 1][col];
        int right = grid[row][col + 1];
        
        if (below < right) return new Location(row + 1, col);
        else return new Location(row, col + 1);
        return null;
    }

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        return 0;
    }
}