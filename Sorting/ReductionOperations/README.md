## Problem
Make all array elements equal by repeatedly reducing the largest element to the next largest value.

Return the number of operations.

---

## Key Idea
Instead of simulating operations, sort the array.

Every time we encounter a new value larger than the previous, all elements before it represent operations needed to reduce it step by step.

---

## Approach
1 Sort the array.
2 Traverse from left to right.
3 When a new value appears:
   add index to operation count.

---

## Example
Input:
[1,1,2,2,3]

Sorted:
[1,1,2,2,3]

Operations:
2 + 2 = 4

Output:
4

---

## Time Complexity
O(n log n)

---

## Space Complexity
O(1)

---

## Language
Java