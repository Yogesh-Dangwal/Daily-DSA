## Problem
Sort the array based on:
1. Number of 1 bits in binary representation.
2. If equal, sort numerically.

---

## Approach
- Use Integer.bitCount() to count set bits.
- Use custom comparator in Arrays.sort().
- Compare by bit count first.
- If equal, compare values.

---

## Time Complexity
- O(n log n)

## Space Complexity
- O(n)

---

## Language
- Java