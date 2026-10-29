class Solution:
    def applyOperations(self, nums: list[int]) -> list[int]:

        n = len(nums)

        for i in range(n - 1):
            if nums[i] == nums[i + 1]:
                nums[i] *= 2
                nums[i + 1] = 0

        write = 0

        for num in nums:
            if num != 0:
                nums[write] = num
                write += 1

        while write < n:
            nums[write] = 0
            write += 1

        return nums
