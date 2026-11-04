class Solution {

    public boolean containsPattern(int[] arr, int m, int k) {

        int n = arr.length;
        if (n < m * k) {
            return false;
        }

        for (int i = 0; i <= n - m * k; i++) {
            boolean valid = true;

            for (int j = 0; j < k - 1; j++) {
                for (int p = 0; p < m; p++) {
                    if (arr[i + p + j * m] != arr[i + p + (j + 1) * m]) {
                        valid = false;
                        break;
                    }
                }
                if (!valid) {
                    break;
                }
            }

            if (valid) return true;
            
        }

        return false;
        
    }

}
