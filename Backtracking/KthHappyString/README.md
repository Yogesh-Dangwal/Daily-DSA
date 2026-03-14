## Problem
Find the k-th lexicographical happy string of length n.

Happy string:
- Uses only a,b,c
- No adjacent equal characters

Return empty string if k exceeds possible strings.

---

## Approach
Use DFS backtracking.

Generate strings in lexicographic order.

Rules:
- Skip same adjacent characters
- Count valid strings
- Stop when k-th found

---

## Time Complexity
O(2^n)

---

## Space Complexity
O(n)

---

## Language
Java