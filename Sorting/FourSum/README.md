# 4Sum

## Problem
Given an integer array `nums` and an integer `target`,
return all unique quadruplets `[nums[a], nums[b], nums[c], nums[d]]`
such that their sum equals `target`.

All indices must be distinct, and the solution should not contain duplicates.

---

## Approach
- Sort the array first.
- Fix the first two numbers using two nested loops.
- Use the two-pointer technique for the remaining two numbers.
- Skip duplicate values to avoid repeating quadruplets.
- Use `long` for sum to avoid integer overflow.

---

## Time Complexity
- **O(n³)**

## Space Complexity
- **O(1)** (excluding output list)

---

## Language
- Java