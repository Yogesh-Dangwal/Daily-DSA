# Find All Possible Stable Binary Arrays I

## Problem
You are given three integers:

- `zero` → number of 0s
- `one` → number of 1s
- `limit` → maximum allowed consecutive identical numbers

A binary array is **stable** if:
1. It contains exactly `zero` number of 0s
2. It contains exactly `one` number of 1s
3. No more than `limit` identical numbers appear consecutively

Return the number of stable binary arrays modulo **1e9 + 7**.

---

## Approach
We use **Dynamic Programming**.

State definition:
dp[i][j][0] → arrays with i zeros and j ones ending with 0
dp[i][j][1] → arrays with i zeros and j ones ending with 1


Transition:

To end with `0`:

dp[i][j][0] = dp[i-1][j][0] + dp[i-1][j][1]


To end with `1`:

dp[i][j][1] = dp[i][j-1][0] + dp[i][j-1][1]


But we must subtract cases where consecutive count exceeds `limit`.

---

## Time Complexity
O(zero × one)

## Space Complexity
O(zero × one)

---

## Language
Java