package Bai1_1;

import java.util.Scanner;

public class Bai1_1 {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So thu nhat: ");
        num1=sc.nextInt();
        System.out.print("Nhap So thu hai: ");
        num2=sc.nextInt();
        sc.close();
        sum=num1+num2;
        System.out.print("Tong cua 2 so vua nhap la: "+ sum);


    }
}
