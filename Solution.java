class Solution {
    public int hardestWorker(int n, int[][] logs) {

        int max = 0, employee = 0, st = 0;

        for (int i = 0; i < logs.length; i++) {

            int ft = logs[i][1];

            if (ft - st > max || (ft - st == max && logs[i][0] < employee)) {
                max = ft - st;
                employee = logs[i][0];
            }

            st = logs[i][1];
        }

        return employee;
    }
}
