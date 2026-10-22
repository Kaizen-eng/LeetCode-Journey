✦ 𝗗𝗮𝘆 𝟰𝟰𝟭 — 𝗤𝘂𝗶𝗰𝗸 𝗡𝗼𝘁𝗲𝘀

🎯 𝗣𝗿𝗼𝗯𝗹𝗲𝗺

LeetCode 1827 — Minimum Operations to Make the Array Increasing.

💡 𝗖𝗼𝗿𝗲 𝗟𝗼𝗴𝗶𝗰

✦ Traverse from index "1" to "n - 1".

✦ If "nums[i] <= nums[i - 1]", the current element must increase.

✦ Calculate the smallest valid value:

"required = nums[i - 1] + 1"

✦ Add the required increments:

"operations += required - nums[i]"

✦ Update "nums[i] = required".

🔑 𝗞𝗲𝘆 𝗜𝗻𝘀𝗶𝗴𝗵𝘁

Always make the current element exactly one greater than its predecessor when the increasing condition is violated.

This greedy choice avoids unnecessary increments while keeping the array strictly increasing.

⚠️ 𝗘𝗱𝗴𝗲 𝗖𝗮𝘀𝗲𝘀

✦ Single-element array → "0" operations.

✦ Already strictly increasing array → "0" operations.

✦ Repeated values → Increase each as needed.

✦ Decreasing values → Adjust each element using its updated predecessor.

⏱️ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ Time: "O(n)"

✦ Auxiliary Space: "O(1)"

🏁 𝗧𝗮𝗸𝗲𝗮𝘄𝗮𝘆

Greedy + Single Pass + In-place Update = Minimum Operations.
