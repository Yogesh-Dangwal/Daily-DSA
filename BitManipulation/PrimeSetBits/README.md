## Problem

Given two integers left and right,
count how many numbers in range [left, right]
have a prime number of set bits in their binary representation.

---

## Important Note
- 1 <= left <= right <= 10^6
- 0 <= right - left <= 10^4
- Maximum set bits for 10^6 is 20.

---

## Approach
- Iterate from left to right.
- Count set bits using Integer.bitCount().
- Check if bit count is prime.
- Increment result if prime.

---

## Time Complexity
- O(n)

## Space Complexity
- O(1)

---

## Language
- Java