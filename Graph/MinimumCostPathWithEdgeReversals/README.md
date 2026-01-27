# Minimum Cost Path with Edge Reversals

## Problem
Find the minimum cost path from node 0 to node n-1 in a directed graph.
Each node allows reversing one incoming edge once at double cost.

---

## Approach
- Use Dijkstra with state tracking
- Each node has two states: switch unused or used
- Normal edges keep the state same
- Reversed edges can only be used if switch unused

---

## Time Complexity
O((n + m) log n)

## Space Complexity
O(n + m)

---

## Language
Java