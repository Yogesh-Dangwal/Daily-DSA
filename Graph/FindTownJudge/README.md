## Problem

In a town of n people labeled from 1 to n, there may be a town judge.

The judge:
- Trusts nobody.
- Is trusted by everyone else.
- Exactly one person satisfies these conditions.

Return the label of the town judge or -1 if none exists.

---

## Important Note
- If a person trusts someone, they cannot be the judge.
- The judge must have exactly n - 1 incoming trusts.

---

## Approach
- Use a single score array.
- For each trust [a, b]:
  - Decrease score[a]
  - Increase score[b]
- The judge must have score = n - 1.
- Return that person, otherwise return -1.

---

## Time Complexity
- **O(n + m)**

## Space Complexity
- **O(n)**

---

## Language
- Java