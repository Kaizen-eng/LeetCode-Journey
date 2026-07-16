//Frequency Array (Optimal)
class Solution {

    public int sumOfUnique(int[] nums) {

        int[] frequency = new int[101];
        int sum = 0;

        for (int num : nums) {
            frequency[num]++;
        }

        for (int num : nums) {
            if (frequency[num] == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
