class Solution {

    public int buttonWithLongestTime(int[][] events) {

        int idx = events[0][0];
        int max_dist = events[0][1];

        for (int i = 1; i < events.length; i++) {

            int dist = events[i][1] - events[i - 1][1];

            if (dist > max_dist) {
                max_dist = dist;
                idx = events[i][0];
            }
            else if (dist == max_dist) {
                idx = Math.min(idx, events[i][0]);
            }
        }

        return idx;

    }

}
