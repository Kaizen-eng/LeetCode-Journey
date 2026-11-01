class Solution:

    def specialArray(self, nums: list[int]) -> int:
        
        n = len(nums)

        freq = [0] * (n + 1)

        for num in nums:
            freq[min(num, n)] += 1

        count = 0

        for x in range(n, -1, -1):
            count += freq[x]

            if count == x:
                return x

        return -1
