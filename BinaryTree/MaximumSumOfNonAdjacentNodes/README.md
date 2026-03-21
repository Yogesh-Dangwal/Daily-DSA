## Problem
Maximum Sum of Non-Adjacent Nodes in Binary Tree

Given a binary tree, find the maximum sum such that no two adjacent nodes (parent-child) are selected.

---

## Approach
This is a Tree DP problem.

For each node we compute:

include → node value + grandchildren  
exclude → best of children  

So each node returns two values.

---

## Time Complexity
O(n)
Each node visited once.

---

## Space Complexity
O(h)
Recursion stack.

---

## Language
Java