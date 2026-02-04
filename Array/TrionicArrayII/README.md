# Maximum Sum Trionic Subarray

---

## 📝 Problem
A trionic subarray follows:
1. Strictly increasing
2. Strictly decreasing
3. Strictly increasing

Find the maximum sum of such a subarray.

---

## 💡 Approach
We:
- Precompute best increasing sums from left and right
- Decompose array into strictly decreasing segments
- Combine three parts to form trionic subarray

---

## ⏱ Complexity
Time: O(n)  
Space: O(n)

---

## Language
- Java