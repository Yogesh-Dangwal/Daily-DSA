## Problem
You are given a binary string s. In one operation, you can flip any character.

Return the minimum number of operations needed to make the string alternating.

An alternating string means no two adjacent characters are the same.

---

## Approach
There are only two possible alternating patterns:

1. Starting with 0 → 010101...
2. Starting with 1 → 101010...

Count mismatches with both patterns and return the minimum.

---

## Time Complexity
O(n)

---

## Space Complexity
O(1)

---

## Language
Java