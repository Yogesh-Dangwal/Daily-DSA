## Problem

Given an integer n, return true if it is a power of two.

An integer n is a power of two if:
n == 2^x for some integer x.

---

## Important Note
- n can be negative.
- Only positive numbers can be powers of two.
- Power of two has exactly one set bit.

---

## Approach
- If n <= 0 → return false.
- Use bit trick:
  n & (n - 1) == 0
- If true → power of two.

---

## Time Complexity
- O(1)

## Space Complexity
- O(1)

---

## Language
- Java