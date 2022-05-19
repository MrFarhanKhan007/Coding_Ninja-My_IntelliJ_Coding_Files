package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public  static void TowerOfHanoi(int disks,char source,char auxilliary,char destination){
        if (disks==0){
            return;
        }
        else if (disks==1)


            TowerOfHanoi(disks-1,source,destination,auxilliary);
        System.out.println(source+" "+destination);
        TowerOfHanoi(disks-1,auxilliary,source,destination);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        TowerOfHanoi(n,'a','b','c');
    }
}
