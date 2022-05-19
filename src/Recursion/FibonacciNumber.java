package Recursion;
import java.util.Scanner;
public class FibonacciNumber {
    // 0 1 1 2 3 5 8 13 21.....
 public static int fib(int n){
     if (n==0 || n==1) {
         return n;
     }
         return fib(n-1)+fib(n-2);
 }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }
}
