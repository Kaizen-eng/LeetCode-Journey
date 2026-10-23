✦ Notes — LeetCode 1403

✧ Key Concept

Greedy Algorithm: Choose the largest available element first to reach the required sum using as few elements as possible.

✧ Important Observations

- Sorting makes the largest elements easy to access.
- Traversing backward through an ascending array gives elements in descending order.
- The selected sum must be strictly greater than the remaining sum, not equal.
- Since elements are collected in descending order, reversing the result is unnecessary.

✧ Greedy Condition

Stop when:

"selectedSum > remainingSum"

✧ Why Greedy Works

To minimize the number of selected elements, choose the largest elements first. If the selected sum exceeds the remaining sum, no additional elements are needed.

✧ Complexity

- Time: "O(n log n)"
- Result storage: "O(n)" in the worst case.

✦ Sort smart. Pick big. Stop early.
