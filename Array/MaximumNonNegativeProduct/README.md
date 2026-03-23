## Problem
Find path from top-left to bottom-right with maximum non-negative product.

Moves allowed:
Right or Down.

Return product mod 1e9+7.

If negative return -1.

---

## Approach
Use DP:

max[i][j] → max product till cell
min[i][j] → min product till cell

For each cell:

Check:
top max
top min
left max
left min

Multiply with current value.

Store max and min.

---

## Time Complexity
O(m × n)

---

## Space Complexity
O(m × n)

---

## Example
Input:

[[1,-2,1],
 [1,-2,1],
 [3,-4,1]]

Output:

8

---

## Language
Java