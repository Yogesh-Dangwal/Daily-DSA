## Problem
Given a binary tree where each node contains 0 or 1, each root-to-leaf path represents a binary number.
Return the sum of all root-to-leaf binary numbers.

---

## Important Note
- Each path forms a binary number from MSB (root) to LSB (leaf).
- The answer fits within 32-bit integer range.

---

## Approach
- Use DFS traversal.
- Carry current binary value while traversing.
- At each node:
  - Left shift current value.
  - Add node value.
- If leaf:
  - Return the formed number.
- Otherwise:
  - Return sum of left and right subtree results.

---

## Time Complexity
- O(n)

## Space Complexity
- O(h)

---

## Language
- Java