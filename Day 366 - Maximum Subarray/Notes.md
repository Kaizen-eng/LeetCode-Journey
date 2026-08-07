# Notes - Maximum Subarray

## 🔥 Kadane's Algorithm

Kadane's Algorithm finds the maximum sum of a contiguous subarray in O(n) time.

For each element:

```text
sum = max(nums[i], sum + nums[i])
