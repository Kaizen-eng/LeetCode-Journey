class Solution:
    def lastVisitedIntegers(self, nums: List[int]) -> List[int]:
        seen = []
        ans = []
        consecutive_prev = 0

        for num in nums:
            if num == -1:
                consecutive_prev += 1

                if consecutive_prev <= len(seen):
                    ans.append(seen[consecutive_prev - 1])
                else:
                    ans.append(-1)
            else:
                seen.insert(0, num)
                consecutive_prev = 0

        return ans
