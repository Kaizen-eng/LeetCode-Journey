# 📝 𝗡𝗼𝘁𝗲𝘀 — LeetCode 2706

## 🔍 𝗢𝗯𝘀𝗲𝗿𝘃𝗮𝘁𝗶𝗼𝗻

We need to buy exactly **𝘁𝘄𝗼 𝗰𝗵𝗼𝗰𝗼𝗹𝗮𝘁𝗲𝘀** and minimize their total price.

Therefore, the best possible choice is simply the **𝘁𝘄𝗼 𝗰𝗵𝗲𝗮𝗽𝗲𝘀𝘁 𝗰𝗵𝗼𝗰𝗼𝗹𝗮𝘁𝗲𝘀**.

There is no need to check every pair.

## 💡 𝗢𝗽𝘁𝗶𝗺𝗶𝘇𝗲𝗱 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

Maintain two variables:

✦ `first` → **𝘀𝗺𝗮𝗹𝗹𝗲𝘀𝘁 𝗽𝗿𝗶𝗰𝗲** found so far.
✦ `second` → **𝘀𝗲𝗰𝗼𝗻𝗱 𝘀𝗺𝗮𝗹𝗹𝗲𝘀𝘁 𝗽𝗿𝗶𝗰𝗲** found so far.

For every price:

✦ If it is smaller than `first`, move `first` to `second` and update `first`.
✦ Otherwise, if it is smaller than `second`, update `second`.

Finally:

`cost = first + second`

If `cost <= money`:

`remaining = money - cost`

Otherwise, return the original `money`.

## 🚀 𝗪𝗵𝘆 𝗧𝗵𝗶𝘀 𝗪𝗼𝗿𝗸𝘀

The problem asks us to **𝗺𝗶𝗻𝗶𝗺𝗶𝘇𝗲 𝘁𝗵𝗲 𝘁𝗼𝘁𝗮𝗹 𝗰𝗼𝘀𝘁**.

The two smallest prices produce the smallest possible sum of any two chocolates.

So once we know those two values, checking other pairs is unnecessary.

## ⏱️ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ **𝗧𝗶𝗺𝗲:** `O(n)`
✦ **𝗦𝗽𝗮𝗰𝗲:** `O(1)`

## 🎯 𝗟𝗲𝘀𝘀𝗼𝗻

An **𝗮𝗰𝗰𝗲𝗽𝘁𝗲𝗱 𝘀𝗼𝗹𝘂𝘁𝗶𝗼𝗻** can still have room for improvement.

My first solution used **𝘀𝗼𝗿𝘁𝗶𝗻𝗴 + 𝗻𝗲𝘀𝘁𝗲𝗱 𝗹𝗼𝗼𝗽𝘀**, but after analyzing the requirement more carefully, I realized that only the **𝘁𝘄𝗼 𝗺𝗶𝗻𝗶𝗺𝘂𝗺 𝘃𝗮𝗹𝘂𝗲𝘀** matter.

**𝗧𝗵𝗶𝗻𝗸 𝗮𝗯𝗼𝘂𝘁 𝘄𝗵𝗮𝘁 𝘁𝗵𝗲 𝗽𝗿𝗼𝗯𝗹𝗲𝗺 𝗮𝗰𝘁𝘂𝗮𝗹𝗹𝘆 𝗻𝗲𝗲𝗱𝘀.**
