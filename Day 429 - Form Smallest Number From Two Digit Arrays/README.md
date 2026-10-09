
# ✦ LeetCode 2605 — Form Smallest Number From Two Digit Arrays

**Day 429** of the Praz × Luna LeetCode Journey ✦

## 📝 Problem

Given two arrays of distinct digits, `nums1` and `nums2`, return the smallest number that contains at least one digit from each array.

## 💡 Approach — Boolean Array + Greedy

1. Mark the digits present in `nums1` and `nums2` using two boolean arrays.
2. Check digits from `1` to `9` in ascending order. If a digit exists in both arrays, return it.
3. If no common digit exists, find the minimum digit in each array.
4. Place the smaller digit in the tens position and the larger digit in the ones position.

## 🔍 Example

**Input**
```text
nums1 = [4, 7]
nums2 = [2, 9]
```

**Output**
```text
24
```

**Explanation:** There is no common digit. The smallest available digits are `4` and `2`, so the smallest possible number is `24`.

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n + m)
- **Space Complexity:** O(1)

Here, `n` and `m` represent the lengths of the two arrays. The digit range is fixed from 1 to 9.

## ✦ Key Takeaway

Check for the smallest common digit first. If none exists, greedily arrange the two smallest available digits to form the answer.

---

**Day 429 completed!** ✦  
One problem at a time. One step closer to mastery.
