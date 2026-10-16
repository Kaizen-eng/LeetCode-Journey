
class Solution:
    def maxDigitRange(self, nums: list[int]) -> int:
        max_range = -1
        total = 0

        for num in nums:
            digits = [int(d) for d in str(num)]
            digit_range = max(digits) - min(digits)

            if digit_range > max_range:
                max_range = digit_range
                total = num
            elif digit_range == max_range:
                total += num

        return total
