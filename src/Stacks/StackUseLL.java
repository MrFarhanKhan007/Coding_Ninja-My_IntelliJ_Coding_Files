package Stacks;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class StackUseLL {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();

        int q = s.nextInt();

        while (q > 0) {
            int choice, input;
            choice = s.nextInt();

            switch(choice) {
                case 1:
                    input = s.nextInt();
                    stack.push(input);
                    break;

                case 2:
                    System.out.println(stack.pop());
                    break;

                case 3:
                    System.out.println(stack.top());
                    break;

                case 4:
                    System.out.println(stack.getSize());
                    break;

                default:
                    System.out.println((StackUsingLL.isEmpty()) ? "true" : "false");
            }

            q -= 1;
        }

    }

}