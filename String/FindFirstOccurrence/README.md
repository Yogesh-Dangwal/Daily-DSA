## Problem
Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or -1 if not found.

---

## Important Note
- 1 <= haystack.length, needle.length <= 10^4
- Strings contain only lowercase English letters.

---

## Approach
- Iterate through possible starting indices in `haystack`.
- Compare substring character by character.
- Return index if full match is found.
- Otherwise return -1.

---

## Time Complexity
- **O(n × m)**

## Space Complexity
- **O(1)**

---

## Language
- Java