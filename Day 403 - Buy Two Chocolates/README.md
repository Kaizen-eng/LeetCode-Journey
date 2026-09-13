# 🍫 LeetCode 2706 — Buy Two Chocolates

✦ **𝗗𝗮𝘆 𝟰𝟬𝟯** of my **𝟭𝟬𝟬𝟬+ 𝗗𝗮𝘆𝘀 𝗼𝗳 𝗖𝗼𝗱𝗲** journey.

## 🧩 𝗣𝗿𝗼𝗯𝗹𝗲𝗺

Given an integer array `prices` representing chocolate prices and an integer `money` representing the available money, buy exactly **𝘁𝘄𝗼 𝗰𝗵𝗼𝗰𝗼𝗹𝗮𝘁𝗲𝘀** while keeping the remaining money **𝗻𝗼𝗻-𝗻𝗲𝗴𝗮𝘁𝗶𝘃𝗲**.

The goal is to **𝗺𝗶𝗻𝗶𝗺𝗶𝘇𝗲** the total price of the two chocolates.

If buying two chocolates is impossible, return the original amount of `money`.

## 💡 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

The optimal pair will always be the **𝘁𝘄𝗼 𝗰𝗵𝗲𝗮𝗽𝗲𝘀𝘁 𝗰𝗵𝗼𝗰𝗼𝗹𝗮𝘁𝗲𝘀**.

Instead of sorting the array or checking every possible pair, we can find the **𝘀𝗺𝗮𝗹𝗹𝗲𝘀𝘁** and **𝘀𝗲𝗰𝗼𝗻𝗱 𝘀𝗺𝗮𝗹𝗹𝗲𝘀𝘁** prices in a single traversal.

✦ Track the **𝗰𝗵𝗲𝗮𝗽𝗲𝘀𝘁 𝗽𝗿𝗶𝗰𝗲**.
✦ Track the **𝘀𝗲𝗰𝗼𝗻𝗱 𝗰𝗵𝗲𝗮𝗽𝗲𝘀𝘁 𝗽𝗿𝗶𝗰𝗲**.
✦ Calculate their **𝘁𝗼𝘁𝗮𝗹 𝗰𝗼𝘀𝘁**.
✦ If the total is within the budget, return the **𝗿𝗲𝗺𝗮𝗶𝗻𝗶𝗻𝗴 𝗺𝗼𝗻𝗲𝘆**.
✦ Otherwise, return the original `money`.

## ⚡ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ **𝗧𝗶𝗺𝗲 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆:** `O(n)`
✦ **𝗦𝗽𝗮𝗰𝗲 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆:** `O(1)`

## 🧠 𝗞𝗲𝘆 𝗧𝗮𝗸𝗲𝗮𝘄𝗮𝘆

When a problem asks for the **𝗺𝗶𝗻𝗶𝗺𝘂𝗺 𝘀𝘂𝗺 𝗼𝗳 𝗲𝘅𝗮𝗰𝘁𝗹𝘆 𝘁𝘄𝗼 𝗲𝗹𝗲𝗺𝗲𝗻𝘁𝘀**, look for a way to directly identify the **𝘁𝘄𝗼 𝘀𝗺𝗮𝗹𝗹𝗲𝘀𝘁 𝘃𝗮𝗹𝘂𝗲𝘀** instead of checking every possible pair.

## 💻 𝗟𝗮𝗻𝗴𝘂𝗮𝗴𝗲

**𝗝𝗮𝘃𝗮**

## 📅 𝗣𝗿𝗼𝗴𝗿𝗲𝘀𝘀

**𝗗𝗮𝘆 𝟰𝟬𝟯 / 𝟭𝟬𝟬𝟬+** 🚀
