# Construct the Minimum Bitwise Array I

## Problem
Given an array of prime numbers `nums`,
construct an array `ans` such that:

ans[i] OR (ans[i] + 1) == nums[i]

Each `ans[i]` should be minimized.
If it's impossible, return `-1` at that index.

---

## Approach
- If `nums[i]` is a power of 2, it's impossible.
- Otherwise:
  - Find the first `0` bit from the right in `nums[i]`.
  - Flip that bit to `0` to get the smallest possible `ans[i]`.
- This works because `(x OR (x + 1))` fills trailing `1`s.

---

## Time Complexity
- **O(n × log(max(nums)))**

## Space Complexity
- **O(1)** extra space

---

## Language
- Java