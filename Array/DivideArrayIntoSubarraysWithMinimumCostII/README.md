# Divide an Array Into Subarrays With Minimum Cost II

---

## Problem
Divide an array into k contiguous subarrays.
Cost of a subarray = first element of that subarray.

Constraint:
The difference between the starting index of the second subarray and the k-th subarray must be ≤ dist.

---

## Approach
We must choose k−1 split points inside a window of size dist+1.

We maintain two TreeSets:
- using → stores k−1 smallest elements in the window
- waiting → stores remaining elements

We keep a running sum of elements in "using".
Slide the window and rebalance sets at each step.

---

## Time Complexity
O(n log n)

## Space Complexity
O(n)

---

## Language
Java