# Majority Element

## Problem
Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `n / 2` times.
You may assume that the majority element always exists.

---

## Approach (Boyer–Moore Voting Algorithm)
- Maintain a candidate and a frequency counter.
- If frequency becomes zero, choose the current element as the new candidate.
- Increase frequency if the current element matches the candidate.
- Otherwise, decrease frequency.
- The final candidate is the majority element.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

---

## Language
- Java