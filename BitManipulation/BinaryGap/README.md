## Problem

Given a positive integer n, return the longest distance
between two adjacent 1's in its binary representation.

If there are fewer than two 1's, return 0.

---

## Important Note
- Distance = difference between bit positions.
- Only consider adjacent 1's.
- 1 <= n <= 10^9.

---

## Approach
- Traverse bits using right shift.
- Track previous index of 1.
- Compute distance between consecutive 1's.
- Keep maximum distance.

---

## Time Complexity
- O(log n)

## Space Complexity
- O(1)

---

## Language
- Java