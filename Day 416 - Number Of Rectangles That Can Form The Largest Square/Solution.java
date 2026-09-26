class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxSquare = 0;
        int count = 0;

        for (int[] rectangle : rectangles) {
            int squareSide = Math.min(rectangle[0], rectangle[1]);

            if (squareSide > maxSquare) {
                maxSquare = squareSide;
                count = 1;
            } else if (squareSide == maxSquare) {
                count++;
            }
        }

        return count;
    }
}
