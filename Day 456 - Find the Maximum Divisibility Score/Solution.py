class Solution:
    def maxDivScore(self, nums: list[int], divisors: list[int]) -> int:

        max_score = -1
        answer = -1

        for divisor in divisors:

            score = 0

            for num in nums:
                if num % divisor == 0:
                    score += 1

            if (score > max_score or
                (score == max_score and divisor < answer)):

                max_score = score
                answer = divisor

        return answer
