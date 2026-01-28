# Maximum Subarray (Kadane's Algorithm)

---

## Problem
Find the contiguous subarray with the largest sum and return its sum.

---

## Approach
Use Kadane's Algorithm:
At each index decide whether to start a new subarray or extend the previous one.

curr = max(nums[i], curr + nums[i])
maxSum = max(maxSum, curr)

---

## Example
Input: [-2,1,-3,4,-1,2,1,-5,4]  
Output: 6  
Subarray: [4,-1,2,1]

---

## Time Complexity
O(n)

## Space Complexity
O(1)

---

## Language
Java