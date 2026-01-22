# Minimum Pair Removal to Sort Array I

## Problem
Given an array `nums`, you can repeatedly:
- Select the adjacent pair with the minimum sum
- Replace that pair with their sum

Return the minimum number of operations required
to make the array non-decreasing.

---

## Approach
- Keep checking if the array is non-decreasing.
- If not:
  - Find the adjacent pair with the minimum sum.
  - Replace that pair with their sum.
  - Count the operation.
- Repeat until the array becomes sorted.

---

## Time Complexity
- **O(n³)** (array reconstruction in each step)

## Space Complexity
- **O(n)**

---

## Language
- Java