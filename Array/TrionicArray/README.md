# Trionic Array I

## 📝 Problem
An array is trionic if it contains:
1. A strictly increasing segment
2. Followed by a strictly decreasing segment
3. Followed by another strictly increasing segment

Return true if such a configuration exists.

---

## 💡 Approach
We traverse the array in three phases:
- Increase
- Decrease
- Increase

Each phase must have at least one valid step.

---

## ⏱ Complexity
- Time: O(n)
- Space: O(1)

---

## 🧑‍💻 Java Code

```java
public static boolean isTrionic(int[] nums) {
    int i = 0, n = nums.length;

    while (i + 1 < n && nums[i] < nums[i + 1]) i++;
    if (i == 0) return false;

    int p = i;
    while (i + 1 < n && nums[i] > nums[i + 1]) i++;
    if (i == p) return false;

    while (i + 1 < n && nums[i] < nums[i + 1]) i++;

    return i == n - 1;
}
