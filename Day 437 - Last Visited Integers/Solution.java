class Solution {

    public List<Integer> lastVisitedIntegers(int[] nums) {

        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int consecutivePrev = 0;

        for (int num : nums) {
            
            if (num == -1) {
                consecutivePrev++;

                if (consecutivePrev <= seen.size()) {
                    ans.add(seen.get(consecutivePrev - 1));
                } 
                
                else {
                    ans.add(-1);
                }

            } 
            
            else {
                seen.add(0, num);
                consecutivePrev = 0;
            }

        }

        return ans;
        
    }

}
