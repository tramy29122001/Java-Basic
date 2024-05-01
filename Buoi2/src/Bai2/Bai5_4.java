package Bai2;

import java.util.Scanner;

public class Bai5_4 {
    public static void main(String[] args) {
        float r,chuVi,dienTich;
        final float Pi= (float) 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh cua hinh tron: ");
        r=sc.nextFloat();
        sc.close();
        //tinh toan
        chuVi=2*r*Pi;
        dienTich=r*r*Pi;
        //In ra ket qua
        System.out.println("Chu vi cua hinh tron la: "+chuVi);
        System.out.println("Dien tich cua hinh tron la: "+dienTich);

    }
}
