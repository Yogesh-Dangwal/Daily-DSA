## Problem
Construct binary tree using inorder and postorder traversal.

---

## Key Properties
Inorder:
Left Root Right

Postorder:
Left Right Root

Last element of postorder is root.

---

## Approach
1 Take last postorder element as root.
2 Find root index in inorder.
3 Build right subtree.
4 Build left subtree.

Use hashmap for fast lookup.

---

## Time Complexity
O(n)

---

## Space Complexity
O(n)

---

## Example
Input:

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]

Output:

[3,9,20,null,null,15,7]

---

## Language
Java