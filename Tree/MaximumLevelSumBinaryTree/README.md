# Maximum Level Sum of a Binary Tree

## Problem
Given the root of a binary tree, where the root is at level 1,
return the smallest level number that has the maximum sum of node values.

---

## Approach
- Use Breadth-First Search (Level Order Traversal).
- Traverse the tree level by level using a queue.
- For each level, calculate the sum of node values.
- Track the maximum sum and its corresponding level.
- Return the smallest level with the maximum sum.

---

## Time Complexity
- **O(n)** where `n` is the number of nodes.

## Space Complexity
- **O(n)** due to the queue used for level order traversal.

---

## Language
- Java