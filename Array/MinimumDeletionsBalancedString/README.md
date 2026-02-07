# Minimum Deletions to Make String Balanced
A string is balanced if all 'a' characters appear before any 'b'.

---

## Approach
We scan the string once and keep track of:
- Number of 'b's seen so far
- Minimum deletions required

When we encounter 'a' after 'b's, we either:
- Delete this 'a'
- Or delete a previous 'b'

We choose the minimum of these options.

---

## Example
Input: "aababbab"
Output: 2

---

## Complexity
Time: O(n)
Space: O(1)

---

## Language
- Java