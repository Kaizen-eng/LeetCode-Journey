# ✦ 2432. 𝗧𝗵𝗲 𝗘𝗺𝗽𝗹𝗼𝘆𝗲𝗲 𝗧𝗵𝗮𝘁 𝗪𝗼𝗿𝗸𝗲𝗱 𝗼𝗻 𝘁𝗵𝗲 𝗟𝗼𝗻𝗴𝗲𝘀𝘁 𝗧𝗮𝘀𝗸

✦ 𝗟𝗲𝗲𝘁𝗖𝗼𝗱𝗲: 2432  
✦ 𝗗𝗶𝗳𝗳𝗶𝗰𝘂𝗹𝘁𝘆: Easy  
✦ 𝗟𝗮𝗻𝗴𝘂𝗮𝗴𝗲: Java  
✦ 𝗧𝗼𝗽𝗶𝗰𝘀: Array, Simulation

## ✦ 𝗣𝗿𝗼𝗯𝗹𝗲𝗺

Each log contains:

- `id` → employee ID
- `leaveTime` → time at which that employee finishes the task

A task starts immediately after the previous task ends. The first task starts at time `0`.

Return the employee who worked for the **longest duration**.

If multiple employees have the same longest duration, return the employee with the **smallest ID**.

## ✦ 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

The logs are already ordered by finishing time, so we can process them in one pass.

For every task:

`duration = currentLeaveTime - previousLeaveTime`

Keep track of:

- `max` → longest duration seen so far
- `employee` → employee responsible for that longest duration
- `st` → previous task's finishing time

There are two cases where we update the answer:

1. The current duration is **greater** than `max`.
2. The current duration is **equal** to `max`, but the current employee ID is **smaller**.

That second condition is the important tie-breaker.

## ✦ 𝗧𝗶𝗲 𝗕𝗿𝗲𝗮𝗸𝗲𝗿

For example:

`[36, 3]` → duration `3`

`[12, 8]` → duration `3`

Both worked for the same longest duration, so:

`min(36, 12) = 12`

Therefore, employee `12` wins.

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

- 𝗧𝗶𝗺𝗲: `O(logs.length)`
- 𝗦𝗽𝗮𝗰𝗲: `O(1)`

## ✦ 𝗞𝗲𝘆 𝗟𝗲𝘀𝘀𝗼𝗻

Finding the maximum is only half the problem.

Always check the statement for a **tie-breaking rule**. A solution can calculate the maximum correctly and still fail hidden test cases if the tie condition is ignored.
