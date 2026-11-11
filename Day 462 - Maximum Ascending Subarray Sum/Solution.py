class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:

        curr_sum = nums[0]
        pre_sum = nums[0]

        for i in range(1, len(nums)):

            if nums[i] > nums[i - 1]:
                curr_sum += nums[i]

            else:
                curr_sum = nums[i]

            pre_sum = max(curr_sum, pre_sum)

        return pre_sum
