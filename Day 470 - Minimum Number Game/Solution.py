class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:

        nums.sort()

        arr = []

        for i in range(0, len(nums), 2):

            Alice = nums[i]
            Bob = nums[i + 1]

            arr.append(Bob)
            arr.append(Alice)

        return arr
