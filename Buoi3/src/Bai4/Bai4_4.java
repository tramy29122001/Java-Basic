package Bai4;

import java.util.Scanner;

public class Bai4_4 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        x=sc.nextInt();
        sc.close();
        if (x>0){
            System.out.println(x + " la so duong");
        }else if (x<0){
            System.out.println(x + " la so am");
        }else {
            System.out.println(x + " khong phai la so duong cung khong phai la so am");
        }
    }
}
