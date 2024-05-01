package Bai2;

import java.util.Scanner;

public class Bai5_1 {
    public static void main(String[] args) {
        float chieuDai,chieuRong, dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        chieuDai=sc.nextFloat();
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        chieuRong=sc.nextFloat();
        sc.close();
        dienTich=chieuDai*chieuRong;
        System.out.print("Dien tich cua hin chu nhat la: "+dienTich);
    }
}
