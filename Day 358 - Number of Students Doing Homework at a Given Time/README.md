# Day 358 - Number of Students Doing Homework at a Given Time

## Problem
Given the start and end times of students' homework along with a query time, determine how many students are doing their homework at that specific moment.

## Approach
- Traverse the arrays once.
- Count every student whose homework interval contains the query time.

Condition:
startTime[i] <= queryTime <= endTime[i]

## Time Complexity
O(n)

## Space Complexity
O(1)
