package Sorting.InsertionSortList;
class ListNode{

    int val;
    ListNode next;

    ListNode(int v){
        val=v;
    }
}

public class InsertionSortList {

    public static ListNode insertionSortList(ListNode head){

        ListNode dummy=new ListNode(0);

        while(head!=null){

            ListNode next=head.next;

            ListNode prev=dummy;

            while(prev.next!=null && prev.next.val<head.val)
                prev=prev.next;

            head.next=prev.next;
            prev.next=head;

            head=next;
        }

        return dummy.next;
    }

    public static void print(ListNode head){

        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static void main(String[] args){

        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(3);

        head=insertionSortList(head);

        print(head);
    }
}