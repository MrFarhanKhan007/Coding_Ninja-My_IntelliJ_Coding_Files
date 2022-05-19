package LinkedLists;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.Scanner;

public class ReverseIterative {

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> curr= head;
        Node<Integer> prev=null;
        Node<Integer> temp;

        while (curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

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


    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        head= reverse(head);
        print(head);
    }
}
