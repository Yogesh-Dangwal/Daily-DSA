# Minimum Cost to Convert String II

## Problem
Convert source string into target using substring transformations with minimum cost.

## Key Idea
- Each transformation is a graph edge between strings
- Use Floyd–Warshall to find cheapest chain transformations
- Use DP to split source string into independent segments

## Algorithm
1. Map substrings to IDs
2. Build cost graph
3. Floyd–Warshall for all-pairs shortest cost
4. DP on string positions

## Time Complexity
O(M³ + N*M)

## Space Complexity
O(M²)

## File
MinimumCostToConvertStringII.java
