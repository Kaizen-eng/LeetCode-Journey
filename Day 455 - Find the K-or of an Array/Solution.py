
class Solution:
    def findKOr(self, nums: List[int], k: int) -> int:
        answer = 0

        for bit in range(31):
            count = 0

            for num in nums:
                if num & (1 << bit):
                    count += 1

            if count >= k:
                answer |= (1 << bit)

        return answer
