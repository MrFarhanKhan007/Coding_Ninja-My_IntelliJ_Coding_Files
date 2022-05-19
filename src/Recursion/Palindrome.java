package Recursion;

import java.util.Scanner;

public class Palindrome {

    public static boolean checkPal(String str,int s,int e){
        if (s==e){
            return true;
        }
        if (str.charAt(s)!=str.charAt(e)){
            return false;
        }

        if (s < e + 1)
            return checkPal(str, s + 1, e - 1);

        return true;
    }

    public static boolean isStringPalindrome(String input)
    {   int n = input.length();
        if (n == 0)
            return true;
        return checkPal(input, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        System.out.println(isStringPalindrome(input));
    }

}
