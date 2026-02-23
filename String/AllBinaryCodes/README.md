## Problem

Given a binary string s and integer k,
return true if every binary code of length k
is a substring of s.

---

## Important Note
- There are 2^k possible binary codes.
- s length ≤ 5 * 10^5.
- 1 ≤ k ≤ 20 (practical limit).

---

## Approach
- Compute total = 2^k.
- Slide window of size k.
- Insert substrings into a HashSet.
- If set size equals total → return true.
- Otherwise return false.

---

## Time Complexity
- O(n * k)

## Space Complexity
- O(2^k)

---

## Language
- Java