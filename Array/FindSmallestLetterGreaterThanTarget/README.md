# Find Smallest Letter Greater Than Target

## Problem
Given a sorted array of letters, find the smallest letter strictly greater than the target.
If not found, return the first letter (wrap-around).

## Approach
Use Binary Search to find the first letter > target.
If index goes out of bounds, return letters[0].

## Example
Input: letters = ["c","f","j"], target = "j"
Output: "c"

## Time Complexity
O(log n)

## Space Complexity
O(1)

## File
FindSmallestLetterGreaterThanTarget.java

## Language
Java