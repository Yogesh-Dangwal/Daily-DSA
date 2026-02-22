## Problem

Given an integer array nums that may contain duplicates,
return all possible subsets (the power set).

The solution set must not contain duplicate subsets.

---

## Important Note
- 1 <= nums.length <= 10
- Array may contain duplicates.
- Subsets must be unique.

---

## Approach
- Sort the array.
- Use backtracking.
- Add current subset to result.
- Skip duplicates at the same recursion level.
- Backtrack properly.

---

## Time Complexity
- O(2^n)

## Space Complexity
- O(n)

---

## Language
- Java