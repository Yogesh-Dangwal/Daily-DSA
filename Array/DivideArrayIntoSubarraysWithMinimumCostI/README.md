# Divide an Array Into Subarrays With Minimum Cost I

## Problem
Divide an array into 3 contiguous subarrays.  
Cost of a subarray = first element of that subarray.  
Return the minimum possible total cost.

## Approach
The first subarray must start at index 0.  
We only need to pick two more starting points with minimum values.

So find the two smallest elements from index 1 to n-1.

## Example
Input: [10,3,1,1]  
Output: 12  
Split: [10,3], [1], [1]

## Time Complexity
O(n)

## Space Complexity
O(1)

## File
DivideArrayIntoSubarraysWithMinimumCostI.java

## Language
Java