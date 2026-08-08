# Notes

## Core Idea

We only need to track population changes.

For every `[birth, death]`:

population[birth - 1950]++;
population[death - 1950]--;

The death year is not included because the person is no longer alive in that year.

## Example

[1950, 1955]
[1952, 1956]

Population:

1950 → 1
1951 → 1
1952 → 2
1953 → 2
1954 → 2
1955 → 1
1956 → 0

Maximum population = 2

Earliest year = 1952

## Important Detail

Use:

if (currentPopulation > maxPopulation)

instead of `>=` because the problem asks for the earliest year when multiple years have the same maximum population.
