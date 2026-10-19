class Solution {

    public int[] circularGameLosers(int n, int k) {

        boolean[] visited = new boolean[n];

        int current = 0;
        int turn = 1;

        while (!visited[current]) {
            visited[current] = true;
            current = (current + turn * k) % n;
            turn++;
        }

        int count = 0;
        for (boolean seen : visited) {
            if (!seen) {
                count++;
            }
        }

        int[] losers = new int[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                losers[index++] = i + 1;
            }
        }

        return losers;
        
    }

}
