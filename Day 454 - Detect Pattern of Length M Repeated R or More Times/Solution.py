class Solution:
    def containsPattern(self, arr, m, k):

        for i in range(len(arr) - m * k + 1):

            count = 0

            for j in range(m * (k - 1)):

                if arr[i + j] == arr[i + j + m]:
                    count += 1
                else:
                    break

            if count == m * (k - 1):
                return True

        return False
