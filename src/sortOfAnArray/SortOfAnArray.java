package sortOfAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ar[] = new int[input];
        for (int i = 0 ;i <ar.length;i++){
            System.out.println("i:");
            ar[i]=sc.nextInt();
        }

        System.out.println("Enter desire number");
        int n = sc.nextInt();

        for (int i = 0; i<= ar.length-1;i++){
        if (ar[i]+ar[i+1]==n){
            System.out.println(ar[i]+" "+ar[i+1]);
        }
        }
    }
}
