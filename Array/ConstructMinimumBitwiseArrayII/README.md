# Construct the Minimum Bitwise Array II

## Problem
You are given an array of prime numbers `nums`.

Construct an array `ans` such that:
ans[i] OR (ans[i] + 1) == nums[i]

Each `ans[i]` should be minimized.
If no valid value exists, return `-1`.

---

## Approach
- If `nums[i] == 2`, no valid answer exists.
- For all other values:
  - Use bit manipulation to remove the lowest valid bit.
  - This ensures the smallest possible value of `ans[i]`.

Formula used:
ans[i] = n - ((n + 1) & (-n - 1)) / 2

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)** extra space

---

## Language
- Java