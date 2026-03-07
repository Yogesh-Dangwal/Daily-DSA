## Problem
Daily Temperatures

Given an array of daily temperatures, return an array such that:
answer[i] = number of days until a warmer temperature.

If none exists, return 0.

---

## Approach
Use a monotonic decreasing stack storing indices.

When a warmer temperature appears, pop indices from the stack
and compute the distance.

---

## Time Complexity
O(n)

## Space Complexity
O(n)

---

## Language
Java