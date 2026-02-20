## Problem

A special binary string has:
- Equal number of 0's and 1's.
- Every prefix has at least as many 1's as 0's.

Given a special binary string s,
return the lexicographically largest string possible
by swapping consecutive special substrings.

---

## Important Note
- s length ≤ 50.
- Structure similar to valid parentheses.
- Recursion required.

---

## Approach
- Treat 1 as '(' and 0 as ')'.
- Split into smallest special substrings.
- Recursively optimize inside.
- Sort substrings in descending order.
- Concatenate results.

---

## Time Complexity
- O(n^2 log n)

## Space Complexity
- O(n)

---

## Language
- Java