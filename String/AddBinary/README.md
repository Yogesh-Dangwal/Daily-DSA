## Problem
Given two binary strings `a` and `b`, return their sum as a binary string.

---

## Important Note
- The input strings can be up to 10^4 in length.
- No leading zeros except for the string "0".
- The result must be returned as a binary string.

---

## Approach
- Use two pointers starting from the end of both strings.
- Maintain a carry value.
- Add digits and carry.
- Append (sum % 2) to result.
- Update carry = sum / 2.
- Reverse final result string.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(n)**

---

## Language
- Java