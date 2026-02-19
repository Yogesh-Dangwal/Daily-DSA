## Problem

Given a binary string s, return the number of non-empty substrings
that have equal number of 0's and 1's, and all 0's and 1's
are grouped consecutively.

---

## Important Note
- Substrings must have consecutive grouping.
- Count duplicates separately.
- 1 <= s.length <= 10^5.

---

## Approach
- Count lengths of consecutive groups.
- For each adjacent pair of groups:
    Add min(group1, group2).
- Use two variables:
    prevGroup and currGroup.
- Traverse once and accumulate result.

---

## Time Complexity
- O(n)

## Space Complexity
- O(1)

---

## Language
- Java