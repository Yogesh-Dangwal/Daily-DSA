## Problem

Given a pattern and a string s, determine if s follows the same pattern.

There must be a bijection between letters in pattern and words in s.

---

## Important Note
- Each letter maps to exactly one word.
- Each word maps to exactly one letter.
- No two letters map to same word.
- No two words map to same letter.
- Words are separated by single spaces.

---

## Approach
- Split string into words.
- If length mismatch → return false.
- Use two HashMaps:
  - Character → Word
  - Word → Character
- Validate mapping consistency at each step.

---

## Time Complexity
- O(n)

## Space Complexity
- O(n)

---

## Language
- Java