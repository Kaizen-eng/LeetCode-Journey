Notes — LeetCode 1491

🧠 Core Idea

The problem asks for the average after removing exactly two values:

✦ The minimum salary
✦ The maximum salary

We don't need the actual sorted order of the array, so sorting would be unnecessary work.

Instead, track everything we need during one traversal.

🔎 Variables

sum → total of all salaries
min → smallest salary
max → largest salary

Initially:

min = Integer.MAX_VALUE
max = Integer.MIN_VALUE
sum = 0

For every salary:

sum += salary

min = Math.min(min, salary)
max = Math.max(max, salary)

Then:

average = (sum - min - max) / (salary.length - 2)

⚠️ Important Java Detail

The result must be a "double".

If both operands of "/" are integers, Java performs integer division first.

So use:

(double) (sum - min - max) / (salary.length - 2)

This preserves the decimal part of the average.

🚀 Why No Sorting?

Sorting would take:

O(n log n)

But we only need the smallest and largest values.

A single pass gives us both:

O(n)

with constant extra space.

🧪 Example

salary = [1000, 2000, 3000]

sum = 6000
min = 1000
max = 3000

remaining = 6000 - 1000 - 3000
          = 2000

count = 3 - 2
      = 1

average = 2000 / 1
        = 2000

📌 Complexity

✦ Time: "O(n)"
✦ Space: "O(1)"

💭 Lesson

Don't sort when you only need an extreme value.

If a problem asks for the minimum and maximum, think about whether a simple traversal can solve it before reaching for sorting.
