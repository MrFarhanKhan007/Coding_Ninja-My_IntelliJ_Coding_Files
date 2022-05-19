package LinkedLists;

import java.util.Scanner;

public class SampleSpace {


    public static Node<Integer> takeInput() {

        Node<Integer> head = null;
        Node<Integer> tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();


        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node<Integer> ReverseR(Node<Integer> head){
        if (head==null || head.next==null){
            return head;
        }
        Node<Integer> finalhead= ReverseR(head.next);
        Node<Integer> temp= finalhead;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next= head;
        head.next= null;

        return finalhead;

    }
    public static void print(Node<Integer>head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer>head= takeInput();
        head=ReverseR(head);
        print(head);
    }
}
