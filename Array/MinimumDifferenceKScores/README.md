# Minimum Difference Between Highest and Lowest of K Scores

## Problem
Given student scores and an integer `k`, pick any `k` students such that
the difference between the highest and lowest scores is minimized.

---

## Approach
1. Sort the scores.
2. Slide a window of size `k`.
3. For each window, compute:
   `nums[i + k - 1] - nums[i]`.
4. Return the minimum value.

---

## Time Complexity
- O(n log n)

## Space Complexity
- O(1) (ignoring sorting space)

---

## Language
- Java