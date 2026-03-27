## Problem
Given integer c, check if:

a² + b² = c

Return true if possible.

---

## Approach
Use two pointers:

left = 0  
right = sqrt(c)

If sum small → increase left  
If sum big → decrease right  

---

## Time Complexity
O(√c)

---

## Space Complexity
O(1)

---

## Example
Input:

5

Output:

true

Because:

1² + 2² = 5

---

## Language
Java