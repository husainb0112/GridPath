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
        int below = Integer.MAX_VALUE;        
        if (row < grid.length - 1) {
            below = grid[row + 1][col];
            return new Location(row + 1, col);
        }
        int right = Integer.MAX_VALUE;
        if (col < grid[0].length - 1) {
            right = grid[row][col + 1];
            return new Location(row, col + 1);
        } else return new Location(row, col + 1);
    }

    public int sumPath(int row, int col) {
        return 0;
    }
}