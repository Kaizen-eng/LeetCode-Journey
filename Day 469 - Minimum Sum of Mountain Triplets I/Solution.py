class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        
        min_sum = float('inf')

        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums) - 1):
                for k in range(j + 1, len(nums)):

                    if nums[i] < nums[j] and nums[k] < nums[j]:

                        min_sum = min(
                            min_sum,
                            nums[i] + nums[j] + nums[k]
                        )

        return -1 if min_sum == float('inf') else min_sum
