class Solution:
    def countElements(self, nums: List[int]) -> int:

        minimum = min(nums)
        maximum = max(nums)

        count = 0

        for num in nums:
            if minimum < num < maximum:
                count += 1

        return count
