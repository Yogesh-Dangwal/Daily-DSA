# Convert Sorted Array to Binary Search Tree

## Problem
Given a sorted array of integers, convert it into a height-balanced
Binary Search Tree (BST).

A height-balanced BST is one where the depth of the two subtrees of every
node never differs by more than one.

---

## Approach
- Use recursion.
- Choose the middle element of the array as the root.
- Recursively build the left subtree using the left half of the array.
- Recursively build the right subtree using the right half of the array.
- This ensures the tree remains height-balanced.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(log n)** due to recursion stack.

---

## Language
- Java