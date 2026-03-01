## Problem
Partitioning Into Minimum Number Of Deci-Binary Numbers

A decimal number is called deci-binary if each digit is either 0 or 1 without leading zeros.

Given a string n representing a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.

---

## Important Note
Since each deci-binary number can contribute at most 1 to any digit position,
the minimum number required equals the maximum digit in n.

---

## Approach
- Traverse the string.
- Find the maximum digit.
- Return that digit.

---

## Time Complexity
- O(n)

## Space Complexity
- O(1)

---

## Language
- Java