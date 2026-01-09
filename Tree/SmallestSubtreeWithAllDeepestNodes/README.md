# Smallest Subtree with all the Deepest Nodes

## Problem
Given the root of a binary tree, return the smallest subtree that contains
all the deepest nodes in the tree.

The depth of a node is its distance from the root.

---

## Approach
- Use Depth First Search (DFS).
- For each node, compute:
  - The maximum depth of its subtree.
  - The node that represents the smallest subtree containing all deepest nodes.
- If left subtree is deeper, return left result.
- If right subtree is deeper, return right result.
- If both have the same depth, current node is the answer.

This approach is similar to finding the Lowest Common Ancestor of the deepest leaves.

---

## Time Complexity
- **O(n)** where `n` is the number of nodes.

## Space Complexity
- **O(n)** due to recursion stack.

---

## Language
- Java