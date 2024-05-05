package Bai1;

import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {
        //Chuong trinh nhan 2 so nhap tu ban phim
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a=sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        b=sc.nextInt();
        c=a*b;
        System.out.print(a + " * " + b + " = " + c);
    }
}
