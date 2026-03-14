## Problem
There are `n` people in a queue where the `i-th` person wants `tickets[i]` tickets.

Each second:
- The first person buys 1 ticket.
- If they still need tickets, they go to the end of the queue.
- Otherwise they leave the queue.

Return the time required for the person at index `k` to finish buying tickets.

---

## Approach
For each person:

If `i ≤ k`:

time += min(tickets[i], tickets[k])

If `i > k`:

time += min(tickets[i], tickets[k] - 1)

Sum all contributions.

---

## Time Complexity
O(n)

---

## Space Complexity
O(1)

---

## Language
Java