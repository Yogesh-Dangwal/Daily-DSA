## Problem

We pour champagne into a pyramid of glasses.

Each glass:
- Holds at most 1 cup.
- Overflow splits equally to the two glasses below.

Return how full the glass at (query_row, query_glass) is.

---

## Important Note
- Maximum rows = 100
- Use simulation.
- Cap each glass at 1.

---

## Approach
- Use a 2D DP array.
- Initialize dp[0][0] = poured.
- For each row:
    If dp[i][j] > 1:
        overflow = (dp[i][j] - 1) / 2
        Add overflow to children.
- Return min(1, dp[query_row][query_glass]).

---

## Time Complexity
- O(query_row^2)

## Space Complexity
- O(1)

---

## Language
- Java