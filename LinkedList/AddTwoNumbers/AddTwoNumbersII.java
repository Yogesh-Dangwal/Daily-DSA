package LinkedList.AddTwoNumbers;
public class AddTwoNumbersII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        java.util.Stack<Integer> st1 = new java.util.Stack<>();
        java.util.Stack<Integer> st2 = new java.util.Stack<>();

        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        while (!st1.isEmpty() || !st2.isEmpty() || carry > 0) {
            int sum = carry;

            if (!st1.isEmpty()) {
                sum += st1.pop();
            }

            if (!st2.isEmpty()) {
                sum += st2.pop();
            }

            carry = sum / 10;
            int digit = sum % 10;

            ListNode node = new ListNode(digit);
            node.next = result;
            result = node;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}