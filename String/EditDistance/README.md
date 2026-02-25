## Problem

Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

Allowed operations:
- Insert a character
- Delete a character
- Replace a character

---

## Important Note

The constraints allow string lengths up to 500.
A pure recursive solution would be too slow.
Dynamic Programming is required.

---

## Approach

- Create a 2D DP table of size (n+1) × (m+1).
- dp[i][j] represents minimum operations to convert:
  - first i characters of word1
  - into first j characters of word2
- Initialize base cases:
  - dp[i][0] = i
  - dp[0][j] = j
- If characters match → take diagonal value.
- Else → 1 + min(insert, delete, replace).

Return dp[n][m].

---

## Time Complexity

O(n × m)

## Space Complexity

O(n × m)

---

## Language
- Java