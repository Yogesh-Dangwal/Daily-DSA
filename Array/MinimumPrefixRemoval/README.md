# Minimum Prefix Removal to Make Array Strictly Increasing

## Problem
Given an integer array `nums`, remove exactly one prefix (possibly empty)
such that the remaining array is strictly increasing.

Return the minimum length of the removed prefix.

---

## Approach
- Traverse from the end of the array
- Find the longest suffix that is already strictly increasing
- Remove everything before that suffix

The starting index of this suffix is the answer.

---

## Example
Input:
nums = [1, -1, 2, 3, 3, 4, 5]

Output:
4

---

## Time Complexity
- O(n)

## Space Complexity
- O(1)

---

## Language
- Java