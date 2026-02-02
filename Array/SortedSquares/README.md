# Squares of a Sorted Array

---

## 📝 Problem
Given an integer array sorted in non-decreasing order, return an array of the squares of each number also sorted in non-decreasing order.

---

## 💡 Approach (Two Pointers)

Even though the array is sorted, squaring negative numbers can result in larger values than squaring small positive numbers.

So we:
- Use two pointers (start & end)
- Compare their squares
- Fill the result array from back to front

---

## 🚀 Complexity

- Time Complexity: **O(n)**
- Space Complexity: **O(n)**

---

## 🧑‍💻 Java Code