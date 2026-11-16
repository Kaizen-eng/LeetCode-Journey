class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        freq = [0] * 1001

        max_freq = 0
        result = 0

        for i in range(len(nums) - 1):
            if nums[i] == key:
                target = nums[i + 1]

                freq[target] += 1

                if freq[target] > max_freq:
                    max_freq = freq[target]
                    result = target

        return result
