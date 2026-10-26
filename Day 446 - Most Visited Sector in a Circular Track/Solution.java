class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] visits = new int[n + 1];

        for (int i = 0; i < rounds.length - 1; i++) {
            int sector = rounds[i];

            while (sector != rounds[i + 1]) {
                visits[sector]++;
                sector = sector % n + 1;
            }
        }

        visits[rounds[rounds.length - 1]]++;

        int max = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (visits[i] > max) {
                max = visits[i];
                result.clear();
                result.add(i);
            } else if (visits[i] == max) {
                result.add(i);
            }
        }

        return result;
    }
}
