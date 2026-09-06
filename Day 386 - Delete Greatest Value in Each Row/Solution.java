class Solution {
    public int deleteGreatestValue(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int answer = 0;

        // Sort every row
        for (int[] row : grid) {
            Arrays.sort(row);
        }

        // Process columns from greatest to smallest
        for (int col = cols - 1; col >= 0; col--) {

            int greatest = 0;

            for (int row = 0; row < rows; row++) {
                greatest = Math.max(greatest, grid[row][col]);
            }

            answer += greatest;
        }

        return answer;
    }
}
