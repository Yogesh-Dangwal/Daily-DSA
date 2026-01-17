# Linked List in Binary Tree

## Problem
Given a binary tree and a linked list, determine if the linked list exists
as a downward path in the binary tree.

A downward path starts at any node and moves only to its children.

---

## Approach
- Traverse every node of the binary tree.
- At each node, try to match the linked list starting from that node.
- Use recursion to compare list nodes with tree nodes.
- If values match, continue down either left or right child.

---

## Time Complexity
- **O(N × M)**  
  where `N` is number of tree nodes and `M` is length of the linked list.

## Space Complexity
- **O(M)** due to recursion stack.

---

## Language
- Java