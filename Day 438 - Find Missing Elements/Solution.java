class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> result = new ArrayList<>();

        int smallest = Arrays.stream(nums).min().getAsInt();
        int largest = Arrays.stream(nums).max().getAsInt();

        for (int i = smallest; i <= largest; i++) {

            final int current = i;

            boolean exists = Arrays.stream(nums).anyMatch(n -> n == current);

            if (!exists) {
                result.add(i);
            }
        }

        return result;

    }

}
