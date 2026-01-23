# Minimum Pair Removal to Sort Array II

## Problem
You are given an array `nums`.

Repeatedly:
1. Select the adjacent pair with the minimum sum
2. Replace that pair with their sum

Return the minimum number of operations needed to make the array
non-decreasing.

---

## Key Challenges
- Array size up to **100,000**
- Brute force simulation is too slow

---

## Approach
- Simulate the array as a **doubly linked list**
- Use a **Priority Queue** to always get the minimum adjacent sum
- Track how many adjacent pairs are already sorted
- Stop early once the array becomes non-decreasing

---

## Data Structures Used
- Priority Queue (min-heap)
- Doubly linked list using arrays
- Boolean array to track removed elements

---

## Time Complexity
- **O(n log n)**

## Space Complexity
- **O(n)**

---

## Language
- Java