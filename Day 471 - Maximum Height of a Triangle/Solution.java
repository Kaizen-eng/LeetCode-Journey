
class Solution {

    public int maxHeightOfTriangle(int red, int blue) {

        int first = calculateHeight(red, blue, true);
        int second = calculateHeight(red, blue, false);

        return Math.max(first, second);
    }

    public int calculateHeight(int red, int blue, boolean useRed) {

        int ballsNeeded = 1;
        int count = 0;

        while (true) {

            if (useRed) {

                if (red < ballsNeeded)
                    break;

                red -= ballsNeeded;

            } else {

                if (blue < ballsNeeded)
                    break;

                blue -= ballsNeeded;
            }

            ballsNeeded++;
            useRed = !useRed;
            count++;
        }

        return count;

    }
    
}
