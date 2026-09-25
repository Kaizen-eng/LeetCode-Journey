LeetCode 1491 — Average Salary Excluding the Minimum and Maximum Salary

📌 Problem

You are given an array of unique integers "salary", where "salary[i]" represents the salary of the "i"th employee.

Return the average salary of all employees after excluding the minimum and maximum salary.

The answer is accepted if it is within "10^-5" of the actual answer.

💡 Approach

There is no need to sort the array.

Traverse the array once while maintaining:

✦ "sum" — total salary of all employees
✦ "min" — minimum salary
✦ "max" — maximum salary

After the traversal, remove the minimum and maximum salaries from the total.

The remaining number of employees is:

"salary.length - 2"

Therefore:

"average = (sum - min - max) / (salary.length - 2)"

🔍 Example

Input

salary = [4000, 3000, 1000, 2000]

Calculation

sum = 10000
min = 1000
max = 4000

remaining sum = 10000 - 1000 - 4000
               = 5000

remaining employees = 4 - 2
                     = 2

average = 5000 / 2
        = 2500

Output

2500.00000

⏱️ Complexity

✦ Time Complexity: "O(n)"
✦ Space Complexity: "O(1)"

🧠 Key Takeaway

When only the minimum and maximum values need to be excluded, sorting is unnecessary.

A single traversal can find the required values while keeping the solution efficient.
