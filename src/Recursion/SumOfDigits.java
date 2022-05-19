package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static int Sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10 + Sum(n/10));
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        System.out.println(Sum(n));
    }
}
