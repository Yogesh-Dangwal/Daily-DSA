# Binary Tree Level Order Traversal

## Problem
Given the root of a binary tree, return the level order traversal of its nodes'
values (from left to right, level by level).

---

## Approach
- Use Breadth-First Search (BFS).
- Traverse the tree level by level using a queue.
- For each level, process all nodes currently in the queue.
- Store node values of each level in a separate list.

---

## Time Complexity
- **O(n)** where `n` is the number of nodes.

## Space Complexity
- **O(n)** due to the queue and result list.

---

## Language
- Java