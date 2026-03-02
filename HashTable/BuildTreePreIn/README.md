## Problem
Construct Binary Tree from Preorder and Inorder Traversal.

Given preorder and inorder traversal arrays of a binary tree, construct the tree.

---

## Important Note
- Preorder → Root comes first.
- Inorder → Left subtree | Root | Right subtree.
- All values are unique.

---

## Approach
- Use preorder to pick root.
- Use inorder to split left and right subtree.
- Use HashMap for fast index lookup.
- Recursively build subtrees.

---

## Time Complexity
- O(n)

## Space Complexity
- O(n)

---

## Language
- Java