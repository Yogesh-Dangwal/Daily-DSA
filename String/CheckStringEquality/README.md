## Problem
Check if two strings can be made equal using swaps at distance 2.

---

## Key Observation
Indices form two independent groups:

0 and 2
1 and 3

Characters can only move inside their group.

---

## Approach
1 Extract groups.
2 Sort groups.
3 Compare groups.

---

## Time Complexity
O(1)

---

## Space Complexity
O(1)

---

## Example
Input:

s1 = "abcd"
s2 = "cdab"

Output:

true

---

## Language
Java