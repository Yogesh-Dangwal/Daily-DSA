# Max Dot Product of Two Subsequences

## Problem
Given two integer arrays `nums1` and `nums2`, find the maximum dot product
between **non-empty subsequences** of equal length from both arrays.

A subsequence keeps the relative order of elements.

---

## Approach
- Use Dynamic Programming.
- Let `dp[i][j]` represent the maximum dot product using
  the first `i` elements of `nums1` and first `j` elements of `nums2`.
- At each step, we have three choices:
  1. Take the current pair and start a new subsequence.
  2. Extend a previous subsequence.
  3. Skip an element from either array.
- Initialize DP with very small values to ensure subsequences are non-empty.

---

