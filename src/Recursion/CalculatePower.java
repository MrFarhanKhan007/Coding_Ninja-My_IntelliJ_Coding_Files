package Recursion;

import java.util.Scanner;

public class CalculatePower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        else
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x=scanner.nextInt();
        int n= scanner.nextInt();
        System.out.println(power(x,n));
    }
}
