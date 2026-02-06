# 🟡 Minimum Removals to Balance Array

---

## Problem
An array is **balanced** if:

max element ≤ min element × k

You may remove any number of elements (but not all).  
Return the **minimum removals** needed.

---

## Approach
1. Sort the array.
2. Use a sliding window to find the longest valid subarray where:
   nums[right] ≤ nums[left] × k
3. Answer = total length − longest valid subarray length.

---

## Example

Input:
nums = [2,1,5], k = 2

Output:
1

Explanation:
Remove 5 → remaining [2,1] which satisfies 2 ≤ 1×2

---

## Complexity
- Time: O(n log n)
- Space: O(1)

---

## Language
- Java