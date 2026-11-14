class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:

        minimum = float('inf')

        for i in range(len(nums)):
            for j in range(l, r + 1):

                if i + j <= len(nums):
                    current_sum = sum(nums[i:i + j])

                    if current_sum > 0:
                        minimum = min(minimum, current_sum)

        return minimum if minimum != float('inf') else -1
