## Problem

Given a positive integer n, determine if its binary
representation has alternating bits.

Two adjacent bits must always be different.

---

## Important Note
- 1 <= n <= 2^31 - 1
- Must check bit pattern.

---

## Approach
- Extract last bit using n & 1.
- Right shift number.
- Compare adjacent bits.
- If two adjacent bits are equal → return false.
- Otherwise return true.

---

## Time Complexity
- O(log n)

## Space Complexity
- O(1)

---

## Language
- Java