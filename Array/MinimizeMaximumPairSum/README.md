# Minimize Maximum Pair Sum in Array

## Problem
Given an array of even length, pair up the elements such that:
- Each element is used exactly once
- The maximum pair sum is minimized

Return the minimized maximum pair sum.

---

## Approach
1. Sort the array
2. Pair the smallest element with the largest element
3. Track the maximum sum among all pairs
4. Return that value

This greedy strategy minimizes the worst (maximum) pair sum.

---

## Time Complexity
- **O(n log n)** (sorting)

## Space Complexity
- **O(1)** (ignoring sort space)

---

## Language
- Java