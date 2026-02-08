## Problem: Balanced Binary Tree

A binary tree is considered height-balanced if the depth of the two subtrees of every node never differs by more than 1.

---

## Approach

We use a postorder traversal to compute subtree heights while checking balance. If any subtree is unbalanced, we propagate -1 upward to stop further checks.

---

## Complexity

Time: O(n)

Space: O(h) recursion stack

---

## Key Learning

Instead of calculating height separately, combining height calculation and balance check in one traversal avoids repeated work and improves efficieny.

---

## Language
- Java