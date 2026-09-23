Notes — LeetCode 1909

Core Idea

Find the first pair that violates the strictly increasing condition:

nums[i - 1] >= nums[i]

At this point, one of these two elements must be removed.

nums[i - 1]
nums[i]

Instead of modifying the array, check both possibilities virtually.

Important Observation

Removing an element somewhere else cannot fix the current violation.

Therefore, once the first violation is found, only its two elements need to be considered as removal candidates.

Validation

For a candidate index:

skip = candidate

While traversing the array, ignore that index and compare every remaining element with the previous remaining element.

If every comparison satisfies:

previous < current

the candidate works.

Edge Cases

Already Increasing

[1, 2, 3, 4]

No violation exists → "true".

One Element

[5]

Already strictly increasing → "true".

Violation at the Beginning

[2, 1, 3]

Removing "2" gives:

[1, 3]

→ "true".

Violation at the End

[1, 2, 4, 3]

Removing "3" gives:

[1, 2, 4]

→ "true".

More Than One Irreparable Violation

[5, 4, 3, 2]

Removing one element cannot make the whole array strictly increasing → "false".

Complexity

- Time: "O(n)"
- Space: "O(1)"

Pattern

First violation → identify local candidates → validate globally.

This pattern is useful when one modification is allowed to repair an ordering constraint.
