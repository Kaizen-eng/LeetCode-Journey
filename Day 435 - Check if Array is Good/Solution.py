
class Solution:
    def isGood(self, nums: list[int]) -> bool:
        n = len(nums) - 1
        count = [0] * 201

        for num in nums:
            count[num] += 1

        if count[n] != 2:
            return False

        for i in range(1, n):
            if count[i] != 1:
                return False

        return True
