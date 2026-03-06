## Problem
Given a binary string s without leading zeros, return true if the string contains at most one contiguous segment of ones.

---

## Approach
If there are multiple segments of ones, the pattern "01" must appear in the string.

Check if the string contains "01".

- If yes → return false
- If no → return true

---

## Time Complexity
O(n)

---

## Space Complexity
O(1)

---

## Language
Java