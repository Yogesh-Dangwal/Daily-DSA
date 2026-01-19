# Maximum Side Length of a Square with Sum ≤ Threshold

## Problem
Given a matrix and a threshold value, find the maximum side length of a
square sub-matrix such that the sum of its elements is less than or equal
to the threshold.

---

## Approach
- Use a prefix sum matrix to calculate sub-matrix sums efficiently.
- Try all possible square side lengths starting from 1.
- For each side length, check all possible square positions.
- Use the prefix sum formula to get square sum in O(1).
- Update the maximum valid side length.

---

## Time Complexity
- **O(m · n · min(m, n))**

## Space Complexity
- **O(m · n)**

---

## Language
- Java