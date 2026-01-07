# Maximum Product of Splitted Binary Tree

## Problem
Given the root of a binary tree, remove exactly one edge to split the tree into
two subtrees. Return the maximum product of the sums of the two resulting subtrees.

The result should be returned modulo `10^9 + 7`.

---

## Approach
- First calculate the total sum of all nodes in the tree.
- Perform a postorder traversal.
- For each subtree, calculate its sum.
- Consider splitting the tree at that subtree.
- Compute product = (subtree sum) × (total sum − subtree sum).
- Track the maximum product found.

---

## Time Complexity
- **O(n)** where `n` is the number of nodes.

## Space Complexity
- **O(n)** due to recursion stack.

---

## Language
- Java