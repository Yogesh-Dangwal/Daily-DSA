# Best Time to Buy and Sell Stock

## Problem
Given an array where `prices[i]` is the price of a stock on day `i`,
choose one day to buy and one future day to sell to maximize profit.

Return the maximum profit. If no profit is possible, return 0.

---

## Approach
- Track the minimum price seen so far
- For each day, calculate potential profit
- Update maximum profit accordingly

---

## Example
Input:
[7,1,5,3,6,4]

Output:
5

---

## Time Complexity
O(n)

## Space Complexity
O(1)

---

## Language
Java