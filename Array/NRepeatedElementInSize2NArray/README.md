# N-Repeated Element in Size 2N Array

## Problem
You are given an integer array `nums` of length `2n`.

- The array contains `n + 1` unique elements.
- Exactly one element is repeated `n` times.

Your task is to return the element that is repeated `n` times.

---

## Approach
- Use two nested loops to compare each element with the rest.
- As soon as a duplicate is found, return that element.
- The problem guarantees that exactly one element is repeated `n` times.

---

## Time Complexity
- **O(n²)** due to nested loops.

## Space Complexity
- **O(1)** (no extra data structures used).

---

## Language
- Java