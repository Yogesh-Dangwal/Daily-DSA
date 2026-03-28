## Problem
Given LCP matrix, construct lexicographically smallest string.

LCP[i][j] =
Longest common prefix of suffixes starting at i and j.

---

## Key Observations
If LCP > 0:
characters must match.

So:
lcp[i][j] > 0 → word[i] = word[j]

---

## Approach
1 Build string greedily.
2 Assign smallest possible character.
3 Validate LCP matrix.
4 Return string if valid.

---

## Time Complexity
O(n²)

---

## Space Complexity
O(n)

---

## Example
Input:

lcp =
[4,0,2,0]
[0,3,0,1]
[2,0,2,0]
[0,1,0,1]

Output:

abab

---

## Language
Java