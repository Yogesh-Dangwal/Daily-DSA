## Problem
Given an integer n, return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 10^9 + 7.

---

## Important Note
The concatenated binary number can become extremely large.
We must compute it using modulo arithmetic to prevent overflow.

---

## Approach
- Maintain a running result.
- For each number from 1 to n:
  - Determine its bit length.
  - Left shift the current result by that bit length.
  - Add the current number.
  - Take modulo at each step.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

---

## Language
- Java