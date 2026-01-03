# Add Two Numbers I

## Problem
You are given two non-empty linked lists representing two non-negative integers.
Each node contains a single digit, and the digits are stored in reverse order.

Add the two numbers and return the result as a linked list.

---

## Approach
- Use a dummy node to simplify list construction.
- Traverse both linked lists simultaneously.
- Add corresponding digits along with a carry.
- Create new nodes for each digit of the sum.
- Continue until both lists and carry are exhausted.

---

## Time Complexity
- **O(n)** where `n` is the length of the longer linked list.

## Space Complexity
- **O(n)** for the result linked list.

---

## Language
- Java



---------------------------------------------------------------------------------------------------------------------------------



# Add Two Numbers II

## Problem
You are given two non-empty linked lists representing two non-negative integers.
The most significant digit comes first, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

---

## Approach
- Store digits of both linked lists into two stacks.
- Pop digits from the stacks to add numbers from right to left.
- Maintain a carry for sums greater than 9.
- Build the result linked list from the front.

---

## Time Complexity
- **O(n + m)** where `n` and `m` are lengths of the two linked lists.

## Space Complexity
- **O(n + m)** for stacks used to store digits.

---

## Language
- Java
