class Solution(object):

    def minimumOperations(self, nums):
        
        positive_values = set()

        for num in nums:
            if num > 0:
                positive_values.add(num)

        return len(positive_values)
