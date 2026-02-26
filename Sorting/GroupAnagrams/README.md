## Problem
Given an array of strings, group the anagrams together.

---

## Important Note
- Strings contain lowercase letters.
- Order of output does not matter.

---

## Approach
- Sort each string to create a key.
- Use HashMap:
    key → sorted string
    value → list of anagrams
- Return all grouped lists.

---

## Time Complexity
- O(n * k log k)

## Space Complexity
- O(n * k)

---

## Language
- Java