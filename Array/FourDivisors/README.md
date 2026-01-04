# Four Divisors

## Problem
Given an integer array `nums`, return the sum of divisors of the numbers
that have **exactly four divisors**.
If no such number exists, return `0`.

---

## Approach
- For each number, find all its divisors.
- Count divisors by checking pairs `(i, num / i)` up to `sqrt(num)`.
- If the total divisor count becomes more than 4, stop early.
- If a number has exactly 4 divisors, add their sum to the answer.

---

## Time Complexity
- **O(n × √m)**  
  where `n` is array length and `m` is the value of elements.

## Space Complexity
- **O(1)**

---

## Language
- Java