class Solution:
  
    def thousandSeparator(self, n: int) -> str:
      
        num = str(n)
        result = ""
        count = 0

        i = len(num) - 1

        while i >= 0:
            result += num[i]
            count += 1

            if count == 3 and i != 0:
                result += "."
                count = 0

            i -= 1

        return result[::-1]

# Time Complexity: O(d)
# Space Complexity: O(d)
# d = Number of digits in n
