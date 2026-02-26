## Problem

Given a binary string s, reduce it to 1 using:
- If even → divide by 2
- If odd → add 1

Return the number of steps required.

---

## Important Note

- String length can be up to 500.
- Cannot convert directly to integer safely.
- Must simulate binary addition.

---

## Approach

- Traverse from right to left.
- Maintain carry.
- If bit + carry == 1:
    Add 1 (odd case) → 2 steps.
- Else:
    Divide by 2 → 1 step.
- Add final carry if exists.

---

## Time Complexity
- O(n)

## Space Complexity
- O(1)

---

## Language
- Java