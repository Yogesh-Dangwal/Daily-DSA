## Problem
Given the root of a Binary Search Tree (BST), return a height-balanced BST with the same node values.
A BST is height-balanced if, for every node, the height difference between left and right subtrees is at most 1.

---

## Approach
Perform an inorder traversal of the BST to store node values in a sorted list.

Since inorder traversal of a BST gives sorted order, we can rebuild the tree from this list.

To keep the tree balanced:

Choose the middle element of the list as the root.

Recursively build the left subtree from the left half.

Recursively build the right subtree from the right half.

---

## Time Complexity

O(n) where n is the number of nodes (inorder traversal + tree construction).

## Space Complexity

O(n) for storing node values and recursion stack.

---

## Language
Java