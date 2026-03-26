## Problem
Partition grid into two connected parts with equal sum.

You may remove one cell.

---

## Important Notes
If removing cell:
Remaining section must stay connected.

Only boundary cells near cut are safe.

---

## Approach
1 Calculate total sum
2 Try horizontal cuts
3 Try vertical cuts
4 Check equal sum
5 Else check difference cell

---

## Time Complexity
O(m × n)

---

## Space Complexity
O(1)

---

## Language
Java