# Number of Students Unable to Eat Lunch

## Problem
Students are standing in a queue, and sandwiches are placed in a stack.

Each student has a preference:
- 0 → circular sandwich
- 1 → square sandwich

If the student at the front prefers the sandwich at the top of the stack, they take it and leave.

Otherwise, they go to the end of the queue.

If no student wants the top sandwich, the process stops.

Return the number of students unable to eat.

---

## Approach
Instead of simulating the queue, we count how many students prefer each sandwich type.

Steps:
1. Count number of `0` and `1` preferences.
2. Traverse the sandwich stack.
3. If sandwich is `0` but no students prefer `0`, return remaining `1` students.
4. If sandwich is `1` but no students prefer `1`, return remaining `0` students.
5. Otherwise decrease the corresponding count.

---

## Time Complexity
O(n)

## Space Complexity
O(1)

---

## Language
Java