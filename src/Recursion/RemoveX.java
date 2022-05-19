package Recursion;

import java.util.Scanner;

public class RemoveX {
    public static String RemoveX(String input){
        if (input.length()==0){
            return input;
        }
        if (input.charAt(0)=='x'){
            return RemoveX(input.substring(1));
        }
        else
            return input.charAt(0)+RemoveX(input.substring(1));
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        System.out.println(RemoveX(input));
    }
}
