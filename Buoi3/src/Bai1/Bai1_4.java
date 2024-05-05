package Bai1;

import java.util.Scanner;

public class Bai1_4 {
    public static void main(String[] args) {
        int nam;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap nam can kiem tra: ");
        nam = sc.nextInt();
        if(nam % 400 == 0){
            System.out.print(nam + " la nam nhuan");
        }else {
            System.out.print(nam + " khong phai nam nhuan");
        }
    }
}
