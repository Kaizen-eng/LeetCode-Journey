
class Solution:
    def minSubsequence(self, nums: List[int]) -> List[int]:
        nums.sort()

        remaining_sum = sum(nums)
        selected_sum = 0
        result = []

        for num in reversed(nums):
            result.append(num)
            selected_sum += num
            remaining_sum -= num

            if selected_sum > remaining_sum:
                break

        return result
      
