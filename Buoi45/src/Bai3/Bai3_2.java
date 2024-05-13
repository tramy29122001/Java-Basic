package Bai3;

import java.util.Scanner;

public class Bai3_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        int total=0;
        for (int i=0;i<arr.length;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        for (int j : arr) {
            total += j;
        }
        System.out.print("Total = "+total);
    }
}
