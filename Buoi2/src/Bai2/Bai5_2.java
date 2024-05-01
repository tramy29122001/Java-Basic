package Bai2;

import java.util.Scanner;

public class Bai5_2 {
    public static void main(String[] args) {
        float canh, P, S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh cua hinh vuong: ");
        canh=sc.nextFloat();
        sc.close();

        //Tinh toan
        P=4*canh;
        S=canh*canh;

        //In ket qua ra man hinh
        System.out.println("Chu vi cua hinh vuong la: "+P);
        System.out.print("Dien tich cua hinh vuong la: "+S);
    }
}
