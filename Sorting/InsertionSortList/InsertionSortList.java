package Sorting.InsertionSortList;
public class InsertionSortList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode sorted = insertionSortList(head);

        while (sorted != null) {
            System.out.print(sorted.val);
            if (sorted.next != null) System.out.print(" -> ");
            sorted = sorted.next;
        }
    }
}
