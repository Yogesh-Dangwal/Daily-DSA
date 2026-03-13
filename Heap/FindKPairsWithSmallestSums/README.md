## Problem
Find K Pairs with Smallest Sums

You are given two sorted arrays nums1 and nums2 and an integer k.

A pair consists of one element from nums1 and one from nums2.

Goal: return the k pairs with the smallest sums.

---

## Approach
Min Heap (Priority Queue).

Steps:

1. Insert pairs (i,0) into heap for first k elements.
2. Always remove the smallest sum pair.
3. Add next pair from same row (i,j+1).
4. Repeat until k pairs are found.

This works because arrays are sorted.

---

## Time Complexity
O(k log k)

---

## Space Complexity
O(k)

---

## Language
Java