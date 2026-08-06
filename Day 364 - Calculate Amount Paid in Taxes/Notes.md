# Notes - Day 364

## Key Observation

Each tax bracket only taxes the income that falls within its range.

Example:

Brackets:
[3,50]
[7,10]
[12,25]

Income = 10

Taxable Amounts:
- 0 → 3  = 3
- 3 → 7  = 4
- 7 → 10 = 3

## Important Formula

taxableAmount = Math.min(
    currentUpper - previousUpper,
    income - previousUpper
)

## Why previousUpper?

Using `previousUpper` avoids modifying the input array and makes the solution cleaner.

## Common Mistakes

- Using `upper` directly instead of `upper - previousUpper`.
- Forgetting that percentages should be divided by `100.0`.
- Skipping the first tax bracket.
- Calculating tax for income that never reaches a bracket.
