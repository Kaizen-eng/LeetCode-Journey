class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {

        int maxScore = -1;
        int answer = -1;

        for (int divisor : divisors) {

            int score = 0;

            for (int num : nums) {
                if (num % divisor == 0) {
                    score++;
                }
            }

            if (score > maxScore || (score == maxScore && divisor < answer)) {
                maxScore = score;
                answer = divisor;
            }
        }

        return answer;
    }
}
