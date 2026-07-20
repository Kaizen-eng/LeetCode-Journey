class Solution {

    public int timeRequiredToBuy(int[] tickets, int k) {

        int idx = 0;
        int time = 0;

        while (tickets[k] > 0) {

            if (tickets[idx] > 0) {
                tickets[idx]--;
                time++;
            }

            idx++;

            if (idx == tickets.length) {
                idx = 0;
            }
        }

        return time;
    }
}
