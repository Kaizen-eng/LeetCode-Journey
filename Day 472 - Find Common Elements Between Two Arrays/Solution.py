class Solution:

    def countCommon(self, arr1, arr2):

        elements = set(arr2)
        count = 0

        for num in arr1:
            if num in elements:
                count += 1

        return count

    def findIntersectionValues(self, nums1, nums2):

        count1 = self.countCommon(nums1, nums2)
        count2 = self.countCommon(nums2, nums1)

        return [count1, count2]
