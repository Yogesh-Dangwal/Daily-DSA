## Problem
Given two n × n matrices mat and target.

Check if mat can be rotated (90°,180°,270°) to become equal to target.

---

## Approach
There are only four possible rotations.

1 Compare mat with target.
2 Rotate mat by 90°.
3 Repeat up to four times.

If any rotation matches, return true.

---

## Rotation Formula
new[j][n-1-i] = old[i][j]

This rotates matrix 90° clockwise.

---

## Time Complexity
O(n²)

Maximum 4 rotations.

---

## Space Complexity
O(n²)

Temporary rotated matrix.

---

## Example
Input:

mat =
[[0,1],
 [1,0]]

target =
[[1,0],
 [0,1]]

Output:
true

---

## Language
Java