package LinkedList.ReplaceOnesWithCount;

public class ReplaceOnesWithCount {

    static class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
        }
    }

    public static Node modify(Node head) {

        Node curr = head;

        while (curr != null) {

            if (curr.data == '1') {
                int count = 0;
                Node temp = curr;

                while (temp != null && temp.data == '1') {
                    count++;
                    temp = temp.next;
                }

                curr.data = (char) (count + '0');
                curr.next = temp;
            }

            curr = curr.next;
        }

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node('a');
        head.next = new Node('1');
        head.next.next = new Node('1');
        head.next.next.next = new Node('1');
        head.next.next.next.next = new Node('d');
        head.next.next.next.next.next = new Node('1');

        head = modify(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}