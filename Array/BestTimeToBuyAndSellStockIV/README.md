# Best Time to Buy and Sell Stock IV
 
 ---
 
## Problem
Given stock prices and an integer `k`, find the maximum profit
using at most `k` buy-sell transactions.

---

## Approach
- If `k` is large, treat it as unlimited transactions
- Otherwise, use Dynamic Programming
- `dp[t][i]` stores max profit up to day `i` with `t` transactions
- Optimize transitions using a rolling variable

---

## Example
Input:
k = 2  
prices = [3,2,6,5,0,3]

Output:
7

---

## Time Complexity
O(k × n)

## Space Complexity
O(k × n)

---

## Language
Java