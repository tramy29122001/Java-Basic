package Bai3;

import java.util.Scanner;

public class Bai3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        double[] arr=new double[n];
        double total=0;

        for(int i=0; i<arr.length;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" :");
            arr[i]=sc.nextDouble();
        }
        sc.close();
        for (double v : arr) {
            total += v;
        }
        double TBC=total/arr.length;
        System.out.print("Trung binh cong la: "+TBC);

    }
}
