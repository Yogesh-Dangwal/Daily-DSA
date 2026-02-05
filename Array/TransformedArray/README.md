# Transformed Array

---

## 📝 Problem
You are given a circular integer array. For each index:
- Move right if the value is positive
- Move left if negative
- Stay if zero

Return the new transformed array.

---

## 💡 Approach

We simulate circular movement using modulo arithmetic:
# Transformed Array

## 📝 Problem
You are given a circular integer array. For each index:
- Move right if the value is positive
- Move left if negative
- Stay if zero

Return the new transformed array.

---

## 💡 Approach

We simulate circular movement using modulo arithmetic:

newIndex = ((i + nums[i]) % n + n) % n


This handles both forward and backward wrapping.

---

## ⏱ Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

---

## 🧑‍💻 Java Code