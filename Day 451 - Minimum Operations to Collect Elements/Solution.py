class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        collected = [False] * (k + 1)

        count = 0
        operations = 0

        for i in range(len(nums) - 1, -1, -1):
            num = nums[i]
            operations += 1

            if num <= k and not collected[num]:
                collected[num] = True
                count += 1

            if count == k:
                return operations

        return operations
