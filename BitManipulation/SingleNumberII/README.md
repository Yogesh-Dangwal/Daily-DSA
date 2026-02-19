## Problem

Given an integer array where every element appears three times except one,
find the element that appears once.

Constraints:
- Must run in O(n) time.
- Must use constant extra space.

---

## Important Note
- Cannot use extra hash maps.
- Must use bit manipulation.
- Negative numbers must be handled correctly.

---

## Approach
- Use two variables:
    ones → bits seen once
    twos → bits seen twice
- For each number:
    Update ones and twos using bitwise operations.
- Bits appearing third time are cleared.
- Final answer is stored in ones.

---

## Time Complexity
- O(n)

## Space Complexity
- O(1)

---

## Language
- Java