# 𝐋𝐞𝐞𝐭𝐂𝐨𝐝𝐞 𝟏𝟕𝟎𝟎 — 𝐍𝐮𝐦𝐛𝐞𝐫 𝐨𝐟 𝐒𝐭𝐮𝐝𝐞𝐧𝐭𝐬 𝐔𝐧𝐚𝐛𝐥𝐞 𝐭𝐨 𝐄𝐚𝐭 𝐋𝐮𝐧𝐜𝐡 🥪

## 𝐏𝐫𝐨𝐛𝐥𝐞𝐦

Given students with preferences for circular (`0`) or square (`1`) sandwiches and a stack of sandwiches, return the number of students who are unable to eat lunch.

## 𝐀𝐩𝐩𝐫𝐨𝐚𝐜𝐡

✦ Count the number of students who prefer each sandwich type.

✦ Process the sandwiches from the top of the stack.

✦ If at least one student prefers the current sandwich, that student can take it.

✦ If no remaining student prefers the current sandwich, the process stops.

✦ The remaining students are the ones unable to eat.

## 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲

✦ 𝐓𝐢𝐦𝐞: 𝐎(𝐧)

✦ 𝐒𝐩𝐚𝐜𝐞: 𝐎(𝟏)

## 𝐊𝐞𝐲 𝐋𝐞𝐚𝐫𝐧𝐢𝐧𝐠

✦ We don't need to simulate the queue explicitly.

✦ Since there are only two sandwich types, two counters are enough to represent all remaining preferences.
