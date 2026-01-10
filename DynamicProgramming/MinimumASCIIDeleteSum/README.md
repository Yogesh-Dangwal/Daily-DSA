# Minimum ASCII Delete Sum for Two Strings

## Problem
Given two strings `s1` and `s2`, delete characters from both strings so that
they become equal. Return the minimum possible sum of ASCII values of deleted
characters.

---

## Approach
- Use Dynamic Programming.
- `dp[i][j]` represents the minimum ASCII delete sum to make
  `s1[i...]` and `s2[j...]` equal.
- If characters match, move both pointers.
- If they don’t match, delete one character from either string and
  take the minimum cost.

---

## Time Complexity
- **O(n × m)**

## Space Complexity
- **O(n × m)**

---

## Language
- Java