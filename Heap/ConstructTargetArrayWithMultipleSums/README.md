## Problem
Construct Target Array With Multiple Sums

You are given a target array. Starting from an array of all 1's, you can repeatedly replace any element with the sum of the entire array.

Goal: determine if it is possible to construct the target array.

---

## Approach
Greedy + Max Heap.

Work backwards:
Always pick the largest element because it must have been created from the previous sum.

Steps:
1. Store elements in a max heap.
2. Remove largest element.
3. Compute remaining sum.
4. Restore previous value using:
   previous = largest % remainingSum
5. Repeat until all elements become 1.

If any invalid condition appears → return false.

---

## Time Complexity
O(n log n)

---

## Space Complexity
O(n)

---

## Language
Java