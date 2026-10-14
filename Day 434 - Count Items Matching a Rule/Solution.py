class Solution:
    def countMatches(self, items, ruleKey, ruleValue):
        index = {"type": 0, "color": 1, "name": 2}[ruleKey]
        count = 0

        for item in items:
            if item[index] == ruleValue:
                count += 1

        return count
