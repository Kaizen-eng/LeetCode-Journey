class Solution {

    public int getMaximumGenerated(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        int max = 0;

        for (int i = 1; 2 * i <= n; i++) {

            if (2 * i <= n) {
                ans[2 * i] = ans[i];
                max = Math.max(max, ans[2 * i]);
            }

            if (2 * i + 1 <= n) {
                ans[2 * i + 1] = ans[i] + ans[i + 1];
                max = Math.max(max, ans[2 * i + 1]);
            }
        
        }

        return max;

    }

}
