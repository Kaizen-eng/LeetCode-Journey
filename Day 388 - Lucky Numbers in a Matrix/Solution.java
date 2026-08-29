class Solution {

    public List<Integer> luckyNumbers(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowMin = new int[rows];
        int[] colMax = new int[cols];

        for (int i = 0; i < rows; i++) {
            rowMin[i] = Integer.MAX_VALUE;

            for (int j = 0; j < cols; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        for (int j = 0; j < cols; j++) {
            colMax[j] = Integer.MIN_VALUE;

            for (int i = 0; i < rows; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == rowMin[i] &&
                    matrix[i][j] == colMax[j]) {

                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
        
    }

}
