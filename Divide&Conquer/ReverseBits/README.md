## Problem

Reverse the bits of a given 32-bit signed integer.

---

## Important Note
- The input is treated as unsigned.
- Use unsigned right shift (>>>).
- Always process exactly 32 bits.

---

## Approach
- Initialize result = 0.
- For 32 iterations:
  - Shift result left.
  - Add last bit of n.
  - Unsigned right shift n.
- Return result.

---

## Time Complexity
- O(1)

## Space Complexity
- O(1)

---

## Language
- Java