package Bai4;

import java.util.Scanner;

public class Bai4_5 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextInt();
        //int c = Math.min(a,b);
        int c=a<b?a:b;
        System.out.println("So nho nhat la: "+c);
    }
}
