## Problem
Given n and k, return the kth bit of the binary string Sn defined recursively:

S1 = "0"
Sn = Sn-1 + "1" + reverse(invert(Sn-1))

---

## Important Note
- Length of Sn = 2^n - 1
- Middle element is always '1'
- Right half is mirror-inverted of left half

---

## Approach
- Use recursion.
- If k is middle → return '1'
- If k in left → recurse on left
- If k in right → map to mirrored index and invert result

---

## Time Complexity
- O(n)

## Space Complexity
- O(n)

---

## Language
- Java