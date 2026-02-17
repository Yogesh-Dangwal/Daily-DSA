## Problem

Given n pairs of parentheses, generate all combinations
of well-formed parentheses.

---

## Important Note
- 1 <= n <= 8
- The number of valid combinations follows the Catalan sequence.
- Parentheses must be balanced at every step.

---

## Approach
- Use backtracking.
- Track number of '(' and ')' used.
- Add '(' if open < n.
- Add ')' if close < open.
- Stop when string length reaches 2 * n.

---

## Time Complexity
- O(4^n / sqrt(n))

## Space Complexity
- O(n)

---

## Language
- Java