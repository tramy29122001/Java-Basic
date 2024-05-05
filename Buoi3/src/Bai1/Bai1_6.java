package Bai1;

import java.util.Scanner;

public class Bai1_6 {
    public static void main(String[] args) {
        long P, laiSuat;
        int R, T;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien goc P: ");
        P=sc.nextLong();
        System.out.print("Nhap lai suat moi nam R: ");
        R=sc.nextInt();
        System.out.print("Nhap thoi gian(tinh bang nam): ");
        T=sc.nextInt();
        laiSuat=(P*R*T)/100;
        System.out.print("Lai suat la: "+laiSuat);
    }
}
