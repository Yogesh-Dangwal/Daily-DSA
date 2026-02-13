## Problem

You are given a string s containing only 'a', 'b', and 'c'.

A substring is balanced if all distinct characters appear the same number of times.

Return the length of the longest balanced substring.

---

## Important Note
- n can be up to 10^5
- Must avoid O(n²)
- Only 3 characters exist

---

## Approach
We handle three cases:

1. Single character substring
2. Two-character balanced substring
3. Three-character balanced substring

For 2 characters:
- Use prefix difference trick

For 3 characters:
- Encode prefix state uniquely using weighted sum
- Store first occurrence in HashMap
- If state repeats → balanced substring

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(n)**

---

## Language
- Java