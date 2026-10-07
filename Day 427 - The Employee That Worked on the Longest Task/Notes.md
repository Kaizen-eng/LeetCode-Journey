# ✦ 𝗡𝗼𝘁𝗲𝘀 — 𝗗𝗮𝘆 𝟰𝟮𝟱

## ✦ 𝗜𝗱𝗲𝗮

The logs give cumulative finishing times, not individual task durations.

So each task duration is:

`current finish time - previous finish time`

For the first task:

`previous finish time = 0`

## ✦ 𝗖𝗼𝗿𝗲 𝗟𝗼𝗴𝗶𝗰

```text
previous = 0

for every log:
    duration = finish - previous

    if duration > max:
        update answer

    else if duration == max:
        choose smaller employee ID

    previous = finish
```

## ✦ 𝗧𝗵𝗲 𝗕𝘂𝗴 𝗧𝗵𝗮𝘁 𝗖𝗮𝘂𝘀𝗲𝗱 𝟱𝟬 𝗧𝗲𝘀𝘁𝘀 𝘁𝗼 𝗙𝗮𝗶𝗹

The first version used only:

```java
if (duration > max)
```

That correctly handled a new maximum, but ignored ties.

Example:

```text
Employee 36 → duration 3
Employee 12 → duration 3
```

Because:

```text
3 > 3  → false
```

employee `36` remained the answer.

But the problem requires the **smallest employee ID**, so `12` must win.

The fixed condition is:

```java
if (duration > max ||
    (duration == max && currentId < employee))
```

✦ **Classic hidden-test lesson:** maximum + tie-breaker = complete comparison.

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

`O(n)` time and `O(1)` extra space.

## ✦ 𝗠𝗲𝗺𝗼𝗿𝘆 𝗛𝗼𝗼𝗸

Whenever a problem says:

> "If there is a tie..."

immediately add that rule to the comparison logic before coding.

