
class Solution:
    def findMissingElements(self, nums: list[int]) -> list[int]:
        result = []

        smallest = min(nums)
        largest = max(nums)

        for i in range(smallest, largest + 1):
            if i not in nums:
                result.append(i)

        return result
