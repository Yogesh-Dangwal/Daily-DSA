# Minimum Cost to Convert String I

---

## Problem
Convert source string into target string using character transformations with minimum cost.

---

## Approach
Treat each character conversion as a directed weighted edge.
Use Floyd–Warshall algorithm to compute minimum cost between all character pairs.

---

## Algorithm
1. Build 26x26 cost matrix
2. Apply Floyd–Warshall
3. Traverse source and target strings
4. Sum conversion costs
5. Return -1 if conversion is impossible

---

## Example
Input:
source = "abcd"
target = "acbe"

Output:
28

---

## Time Complexity
O(n)

## Space Complexity
O(1)

---

## Language
Java