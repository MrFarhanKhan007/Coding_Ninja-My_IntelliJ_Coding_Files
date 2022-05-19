package Recursion;

import java.util.Scanner;

public class Multiplication {

    public  static int multiplication(int n,int m){
        if (n==1){
            return m;
        }
        int mul=m+multiplication(n-1,m);
        return mul;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(multiplication(n,m));
    }
}
