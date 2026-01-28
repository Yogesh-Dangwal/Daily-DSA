# Minimum Cost Path with Teleportations

## Problem
Find the minimum cost to go from top-left to bottom-right in a grid.
You can move right/down with cost, and teleport up to k times to any
cell with value ≤ current cell at zero cost.

---

## Approach
Use Dijkstra with state:
- Position (i, j)
- Number of teleports used

Normal moves add cost, teleport moves cost 0.

---

## Time Complexity
O(mn log(mn) + k·mn)

## Space Complexity
O(mn·k)

---

## Language
Java