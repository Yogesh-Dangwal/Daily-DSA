# Maximum Matrix Sum

## Problem
You are given a matrix of integers.
You can perform the following operation any number of times:

- Choose any two adjacent elements and multiply both by `-1`.

Return the **maximum possible sum** of all elements in the matrix after performing
any number of operations.

---

## Approach
- Traverse the entire matrix.
- Add the absolute value of each element to the total sum.
- Count how many negative numbers are present.
- Keep track of the smallest absolute value in the matrix.
- If the count of negative numbers is even, the maximum sum is the total sum.
- If the count is odd, subtract twice the smallest absolute value from the total sum.

---

## Time Complexity
- **O(m × n)**

## Space Complexity
- **O(1)**

---

## Language
- Java