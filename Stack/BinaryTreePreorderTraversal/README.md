# Binary Tree Preorder Traversal

## Problem
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Preorder traversal follows this order:
1. Visit root
2. Traverse left subtree
3. Traverse right subtree

---

## Approach
- Use recursion to traverse the tree.
- Start from the root node.
- Add the node value to the result list.
- Recursively traverse the left subtree, then the right subtree.

---

## Time Complexity
- **O(n)** where `n` is the number of nodes.

## Space Complexity
- **O(n)** due to recursion stack and result list.

---

## Language
- Java