# Find All Possible Stable Binary Arrays II

## Problem
You are given three integers:
- zero → number of 0s
- one → number of 1s
- limit → maximum allowed consecutive identical values

A binary array is stable if:
- It contains exactly `zero` zeros
- It contains exactly `one` ones
- No subarray longer than `limit` contains only 0s or only 1s

Return the total number of stable binary arrays modulo **1e9 + 7**.

---

## Approach
We use **Dynamic Programming**.

Define:

dp[i][j][0] → number of arrays with i zeros, j ones ending with 0
dp[i][j][1] → number of arrays with i zeros, j ones ending with 1

Transitions:

Ending with `0`

dp[i][j][0] = dp[i-1][j][0] + dp[i-1][j][1]


Ending with `1`

dp[i][j][1] = dp[i][j-1][0] + dp[i][j-1][1]


We subtract invalid sequences where consecutive count exceeds `limit`.

---

## Time Complexity
O(zero × one)

## Space Complexity
O(zero × one)

---

## Language
Java