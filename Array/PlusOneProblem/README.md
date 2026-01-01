# Plus One

## Problem
You are given a large integer represented as an array of digits.
Each digit is stored such that the most significant digit comes first.
Increment the number by one and return the resulting array.

---

## Approach
- Traverse the array from right to left.
- If the current digit is less than 9, increment it and return the array.
- If the digit is 9, set it to 0 and continue.
- If all digits are 9, create a new array with an extra digit at the front.

---

## Time Complexity
- O(n), where n is the number of digits.

## Space Complexity
- O(n) in the worst case (when all digits are 9).

---

## Language
- Java