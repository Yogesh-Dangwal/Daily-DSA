## Problem
Minimum Number of Seconds to Make Mountain Height Zero

Workers reduce the mountain height simultaneously.

Worker i needs:

t + 2t + 3t + ... + xt seconds

to reduce x units.

Goal: find minimum time to reduce mountain height to zero.

---

## Approach
Binary search on time.

For a given time T:

For each worker calculate maximum x such that:

t * x * (x + 1) / 2 ≤ T

Sum heights reduced by all workers.

If total ≥ mountainHeight → valid time.

---

## Time Complexity
O(n logH logT)

---

## Space Complexity
O(1)

---

## Language
Java