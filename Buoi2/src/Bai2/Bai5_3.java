package Bai2;

import java.util.Scanner;

public class Bai5_3 {
    public static void main(String[] args) {
        float canh1, canh2, canh3, delta, dienTich;
        Scanner sc = new Scanner(System.in);
        //Nhap du lieu
        System.out.print("Nhap canh thu nhat: ");
        canh1=sc.nextFloat();
        System.out.print("Nhap canh thu hai: ");
        canh2=sc.nextFloat();
        System.out.print("Nhap canh thu ba: ");
        canh3=sc.nextFloat();
        sc.close();

        //Tinh toan
        delta=(canh1+canh2+canh3)/2;
        dienTich=(float) Math.sqrt(delta*(delta-canh1)*(delta-canh2)*(delta-canh3));
        System.out.print("Dien tich cua hinh tam giac la: "+ dienTich);

    }
}
