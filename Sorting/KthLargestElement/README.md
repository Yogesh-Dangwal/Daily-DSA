## Problem
Given an integer array nums and an integer k, return the kth largest element in the array.

The kth largest element refers to its position in the sorted order, not the kth distinct element.

---

## Approach
Use a Min Heap of size k.

- Traverse the array.
- Add elements to the heap.
- If heap size exceeds k, remove the smallest element.
- After processing all elements, the heap top is the kth largest element.

---

## Time Complexity
O(n log k)

---

## Space Complexity
O(k)

---

## Language
Java