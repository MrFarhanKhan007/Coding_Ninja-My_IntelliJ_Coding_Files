package Recursion;
import java.util.Scanner;
public  class SumofArray {

public static int sum(int input[]) {
        if(input.length==1)
        return input[0];

        int arr[]=new int[input.length-1];

        for(int i=1;i<input.length;i++)
        arr[i-1]=input[i];

        return (input[0]+sum(arr));

        }    // 2 1 3 4 5
    // 1 3 4 5
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(sum(input));
    }
}
