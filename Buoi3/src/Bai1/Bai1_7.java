package Bai1;

import java.util.Scanner;

public class Bai1_7 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=sc.nextInt();
        System.out.print("Nhap b: ");
        b=sc.nextInt();
        sc.close();

        System.out.println("Phan nguyen la "+a/b);
        System.out.print("Phan du la " + a%b);

    }
}
