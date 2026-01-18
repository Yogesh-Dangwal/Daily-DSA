# Missing Number

## Problem
Given an array containing `n` distinct numbers taken from the range `[0, n]`,
find the one number that is missing from the array.

---

## Approach
- The sum of numbers from `0` to `n` is `n * (n + 1) / 2`.
- Calculate the actual sum of elements in the array.
- The missing number is the difference between the expected sum
  and the actual sum.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

---

## Language
- Java