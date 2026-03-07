## Problem
Minimum Number of Flips to Make Binary String Alternating

You are given a binary string.
You can rotate the string and flip characters.

Find the minimum flips required to make the string alternating.

---

## Approach
Use rotation simulation using s + s.

For every window of length n:
- Compare with pattern 010101...
- Compare with pattern 101010...

Count mismatches using sliding window.

Take minimum.

---

## Time Complexity
O(n)

## Space Complexity
O(n)

---

## Language
Java