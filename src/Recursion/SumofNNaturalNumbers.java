package Recursion;

import java.util.Scanner;

public class SumofNNaturalNumbers {
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(sum(n));
    }
}
