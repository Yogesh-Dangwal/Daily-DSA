package LinkedList.RemoveEvenNodes;

public class RemoveEvenNodes {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    public static Node removeEven(Node head){
        while(head != null && head.data % 2 == 0){
            head = head.next;
        }

        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.data % 2 == 0){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = removeEven(head);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}