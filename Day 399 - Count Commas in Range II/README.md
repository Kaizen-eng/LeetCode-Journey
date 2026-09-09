# 𝐋𝐞𝐞𝐭𝐂𝐨𝐝𝐞 𝟑𝟖𝟕𝟏 — 𝐂𝐨𝐮𝐧𝐭 𝐂𝐨𝐦𝐦𝐚𝐬 𝐢𝐧 𝐑𝐚𝐧𝐠𝐞 𝐈𝐈

## ✦ 𝐃𝐚𝐲: 𝟑𝟗𝟗
## ✦ 𝐃𝐢𝐟𝐟𝐢𝐜𝐮𝐥𝐭𝐲: 𝐌𝐞𝐝𝐢𝐮𝐦
## ✦ 𝐋𝐚𝐧𝐠𝐮𝐚𝐠𝐞: 𝐉𝐚𝐯𝐚

## 𝐀𝐩𝐩𝐫𝐨𝐚𝐜𝐡:

✦ Instead of iterating through every number from 1 to n, I used the positions where commas can occur.
✦ A comma appears after every 𝟑 𝐝𝐢𝐠𝐢𝐭𝐬, so the comma thresholds are powers of 1000.
✦ Starting from 1000, for every threshold t, the numbers from t through n contribute one comma at that position.
✦ The number of such values is:
n - t + 1
✦ After processing one comma position, the threshold is multiplied by 1000 to move to the next position.

## 𝐊𝐞𝐲 𝐈𝐧𝐬𝐢𝐠𝐡𝐭:

✦ 𝐃𝐨𝐧'𝐭 𝐜𝐨𝐮𝐧𝐭 𝐧𝐮𝐦𝐛𝐞𝐫𝐬 𝐨𝐧𝐞 𝐛𝐲 𝐨𝐧𝐞 — 𝐜𝐨𝐮𝐧𝐭 𝐭𝐡𝐞 𝐜𝐨𝐦𝐦𝐚 𝐩𝐨𝐬𝐢𝐭𝐢𝐨𝐧𝐬.

## 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲: 
✦ 𝐓𝐢𝐦𝐞: O(log₁₀₀₀ n)
✦ 𝐒𝐩𝐚𝐜𝐞: O(1)

## 𝐋𝐞𝐚𝐫𝐧𝐢𝐧𝐠
✦ This problem showed me how a simple pattern based on 𝐝𝐢𝐠𝐢𝐭 𝐩𝐨𝐬𝐢𝐭𝐢𝐨𝐧𝐬 can completely eliminate an otherwise impossible brute-force approach.
