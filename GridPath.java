public class GridPath {
    
    private int[][] grid;

    public GridPath(int[][] values) {
        grid = values;
    }

    @Override
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

    public Location getNextLoc(int row, int col) {
        int below = grid[row + 1][col];
        int right = grid[row][col + 1];
        
        if (below < right) return new Location(row + 1, col);
        else return new Location(row, col + 1);
    }

    public int sumPath(int row, int col) {
        return 0;
    }
}