class Solution {

    public long countCommas(long n) {

        long threshold = 1000, answer = 0;

        while ( threshold <= n ) {

            answer += n - threshold + 1;

            threshold *= 1000;

        }

        return answer;

    }

}
