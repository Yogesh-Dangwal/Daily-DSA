## Problem

You are given a string s and an array of strings words.
All words are of the same length.

Return all starting indices of substrings in s that are the
concatenation of each word exactly once in any order.

---

## Important Note
- All words have equal length.
- Order of words does not matter.
- Words may contain duplicates.
- Must use sliding window technique.

---

## Approach
- Let wordLen = length of each word.
- Let wordCount = total words.
- Build frequency map of words.
- Slide window in steps of wordLen.
- Maintain a current window frequency map.
- If a word exceeds allowed frequency:
  - Shrink window from left.
- If window contains all words:
  - Record starting index.

---

## Time Complexity
- **O(n * wordLen)**

## Space Complexity
- **O(wordCount)**

---

## Language
- Java