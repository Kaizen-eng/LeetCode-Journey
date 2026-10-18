# ✦ 𝗗𝗮𝘆 𝟰𝟯𝟴 — 𝗡𝗼𝘁𝗲𝘀

## ✦ 𝗖𝗼𝗿𝗲 𝗜𝗱𝗲𝗮

Find the smallest and largest values, then inspect every integer between them. If an integer does not exist in the input array, add it to the result.

## ✦ 𝗝𝗮𝘃𝗮 𝗥𝗲𝗺𝗶𝗻𝗱𝗲𝗿𝘀

✦ `Arrays.stream(nums).min().getAsInt()` — finds the minimum.

✦ `Arrays.stream(nums).max().getAsInt()` — finds the maximum.

✦ `anyMatch(n -> n == current)` — checks whether an element matches the current integer.

✦ Use a `final` or effectively final variable when capturing the loop value in a lambda.

✦ `result.add(i)` — appends a missing integer to the result list.

## ✦ 𝗣𝘆𝘁𝗵𝗼𝗻 𝗥𝗲𝗺𝗶𝗻𝗱𝗲𝗿𝘀

✦ `min(nums)` — finds the minimum.

✦ `max(nums)` — finds the maximum.

✦ `range(smallest, largest + 1)` — includes the largest integer because Python excludes the ending value.

✦ `if i not in nums:` — checks whether the integer is missing.

✦ `result.append(i)` — adds the missing integer.

## ✦ 𝗘𝗱𝗴𝗲 𝗖𝗮𝘀𝗲𝘀

✦ No missing integers: return an empty list.

✦ Consecutive integers: return an empty list.

✦ Missing integers at the beginning or end of the input's integer range: include them if they fall between the minimum and maximum.

✦ Duplicate values: membership checking still works correctly.

✦ Empty input: minimum and maximum operations need special handling unless the constraints guarantee a non-empty array.

## ✦ 𝗢𝗽𝘁𝗶𝗺𝗶𝘇𝗮𝘁𝗶𝗼𝗻

Repeated membership checks take `O(n × r)` time.

A `HashSet` in Java or a `set` in Python can provide average `O(1)` membership checks, reducing expected total time to `O(n + r)` at the cost of additional space.

## ✦ 𝗧𝗮𝗸𝗲𝗮𝘄𝗮𝘆

Correctness first. Complexity next. Optimization always has a place when performance matters.
