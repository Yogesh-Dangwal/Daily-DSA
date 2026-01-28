# Maximum Number of Words Found in Sentences

---

## Problem
Given an array of sentences, return the maximum number of words in any single sentence.

Each word is separated by a single space.

---

## Approach
Count spaces in each sentence.  
Words = spaces + 1.  
Track the maximum.

---

## Example
Input:
["alice and bob love leetcode", "i think so too", "this is great thanks very much"]

Output:
6

---

## Time Complexity
O(n * m)

## Space Complexity
O(1)

---

## Language
Java