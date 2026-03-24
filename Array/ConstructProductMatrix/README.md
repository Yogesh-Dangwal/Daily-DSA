## Problem
Given a matrix, create product matrix where:

p[i][j] =
product of all elements except grid[i][j]
mod 12345.

---

## Approach
1 Flatten matrix.
2 Build prefix products.
3 Build suffix products.
4 Multiply prefix and suffix.
5 Convert back to matrix.

---

## Time Complexity
O(n × m)

---

## Space Complexity
O(n × m)

---

## Example
Input:

[[1,2],
 [3,4]]

Output:

[[24,12],
 [8,6]]

---

## Language
Java