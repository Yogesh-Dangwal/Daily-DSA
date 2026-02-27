## Problem
Minimum Operations to Equalize Binary String

You are given a binary string `s` and an integer `k`.

In one operation, you must choose exactly `k` different indices and flip them.

Return the minimum number of operations required to make all characters equal to '1'.
If not possible, return -1.

---

## Important Note
Each operation flips exactly `k` bits.
Parity constraints must be considered carefully.

---

## Approach
- Count total zeros in the string.
- If zeros = 0 → return 0.
- If k > length → return -1.
- If k is even and zeros is odd → return -1.
- If zeros is divisible by k → return zeros / k.
- Otherwise return -1.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

---

## Language
- Java