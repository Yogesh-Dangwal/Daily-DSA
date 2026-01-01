# Best Time to Buy and Sell Stock IV

## Problem
Find the maximum profit by completing at most `k` transactions.

## Approach
- If `k >= n / 2`, treat it as unlimited transactions.
- Otherwise, use dynamic programming.
- `dp[i][j]` stores max profit using `i` transactions up to day `j`.

## Complexity
- Time: O(k × n)
- Space: O(k × n)

## Language
- Java