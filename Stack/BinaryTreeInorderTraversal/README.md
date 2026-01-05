# Binary Tree Inorder Traversal

## Problem
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Inorder traversal follows this order:
1. Traverse left subtree
2. Visit root
3. Traverse right subtree

---

## Approach
- Use recursion to traverse the tree.
- First recursively traverse the left subtree.
- Then add the current node's value to the result list.
- Finally traverse the right subtree.

---

## Time Complexity
- **O(n)** where `n` is the number of nodes.

## Space Complexity
- **O(n)** due to recursion stack and result list.

---

## Language
- Java