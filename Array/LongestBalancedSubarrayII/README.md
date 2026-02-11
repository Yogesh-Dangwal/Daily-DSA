## Problem

A subarray is balanced if the number of distinct even numbers equals the number of distinct odd numbers.

Return the length of the longest balanced subarray.

---

## Important Note
We count **distinct** numbers, not frequency.

---

## Approach
- Record all positions of each value.
- Use a segment tree to maintain balance of:
  - +1 for distinct odd
  - -1 for distinct even
- First occurrence of each value contributes to all suffixes.
- As left pointer moves, remove its contribution until the next occurrence.
- Query the furthest index where balance = 0.

---

## Time Complexity
- **O(n log n)**

## Space Complexity
- **O(n)**

---

## Language
- Java