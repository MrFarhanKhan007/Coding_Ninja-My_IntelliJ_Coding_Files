package LinkedLists;

import java.util.Scanner;

public class ReverseLL {

    public static Node<Integer> takeInput(){
        Node<Integer>head=null;
        Node<Integer> tail=null;
        Scanner scanner= new Scanner(System.in);
        int data= scanner.nextInt();

        while (data!=-1){
            Node<Integer> NewNode= new Node<>(data);
            if (head==null){
                head= NewNode;
                tail= NewNode;
            }
            else {
                tail.next= NewNode;
                tail= NewNode;
            }
            data= scanner.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){

        while (head!= null){
            System.out.print(head.data+" ");
            head= head.next;
        }
        System.out.println();

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

    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        head= ReverseR(head);
        print(head);

    }
}
