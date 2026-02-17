## Problem

A binary watch uses:
- 4 LEDs for hours (0–11)
- 6 LEDs for minutes (0–59)

Given an integer turnedOn, return all possible valid times
where exactly turnedOn LEDs are ON.

---

## Important Note
- Hour must not have leading zero.
- Minute must always have two digits.
- 0 <= turnedOn <= 10.

---

## Approach
- Iterate all valid hours (0–11).
- Iterate all valid minutes (0–59).
- Count number of set bits using Integer.bitCount().
- If total equals turnedOn, add formatted time.

---

## Time Complexity
- O(1)

## Space Complexity
- O(1)

---

## Language
- Java