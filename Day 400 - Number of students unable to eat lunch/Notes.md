# 𝐋𝐞𝐞𝐭𝐂𝐨𝐝𝐞 𝟏𝟕𝟎𝟎 — 𝐍𝐨𝐭𝐞𝐬 🧠

### 𝐌𝐚𝐢𝐧 𝐈𝐝𝐞𝐚

✦ The students can move around the queue, but the sandwiches stay fixed in their stack order.

✦ Therefore, instead of simulating every student movement, we can simply track how many students want `0` and how many want `1`.

### 𝐒𝐭𝐞𝐩𝐬

✦ Count the student preferences using two counters.

✦ Traverse the sandwiches from top to bottom.

✦ When the current sandwich has matching students, decrease that count.

✦ When the count for the current sandwich type is `0`, nobody remaining can take it.

✦ At that point, the remaining students cannot eat.

### 𝐊𝐞𝐲 𝐏𝐨𝐢𝐧𝐭

✦ The important observation is that the queue simulation is unnecessary.

✦ We only need to know whether a student with the required preference still exists.

### 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲

✦ 𝐓𝐢𝐦𝐞: 𝐎(𝐧)

✦ 𝐒𝐩𝐚𝐜𝐞: 𝐎(𝟏)
