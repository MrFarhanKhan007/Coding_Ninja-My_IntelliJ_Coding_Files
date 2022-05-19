package Recursion;

import java.util.Scanner;

public class StringtoInteger{
    public static int StringToInteger(String input){
        if (input.length()==0){
            return 0;
        }
        int smallAns= StringToInteger(input.substring(0,input.length()-1));
        int val = (int)(input.charAt(input.length()-1));
        val=val-48;

        return val+smallAns*10;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        System.out.println(StringToInteger(input));
    }
}
