class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    // Start point, do nothing
                    continue;
                } else if (i == 0) {
                    // First row: can only come from the left
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    // First column: can only come from above
                    grid[i][j] += grid[i - 1][j];
                } else {
                    // Min of top or left + current value
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }

        return grid[m - 1][n - 1];
    }
}