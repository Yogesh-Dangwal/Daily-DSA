# Longest Common Prefix

## Problem
Given an array of strings, find the longest common prefix among all strings.
If there is no common prefix, return an empty string.

---

## Approach
- Assume the first string as the initial prefix.
- Compare the prefix with each string in the array.
- If the current string does not start with the prefix, reduce the prefix by one character.
- Repeat until a valid prefix is found or it becomes empty.

---

