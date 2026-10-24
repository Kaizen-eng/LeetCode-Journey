
class Solution:
    def kLengthApart(self, nums: list[int], k: int) -> bool:
        previous_index = -1

        for i, num in enumerate(nums):
            if num == 1:
                if previous_index != -1 and i - previous_index - 1 < k:
                    return False

                previous_index = i

        return True
