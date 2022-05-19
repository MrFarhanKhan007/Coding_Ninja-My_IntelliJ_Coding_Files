package Recursion;

import java.util.Scanner;

public class PairStar {
    public static String PairStar(String input){
       if (input.length()==1){
           return input;
       }
        if (input.charAt(0)== input.charAt(1)){
            String smallOutput= PairStar(input.substring(1));
            return (input.charAt(0)+" * "+smallOutput);
        }
            else{
            String smallOutput= PairStar(input.substring(1));
                return (input.charAt(0)+smallOutput);
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String input= s.nextLine();
        System.out.println(PairStar(input));
    }
}
