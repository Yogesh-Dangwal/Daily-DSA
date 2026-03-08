## Problem
Find a binary string of length n that does not appear in the given array of n unique binary strings.

---

## Approach
Use Cantor's diagonal construction.

Flip the ith bit of the ith string to guarantee the new string differs from every input string.

---

## Time Complexity
O(n)

## Space Complexity
O(n)

---

## Language
Java