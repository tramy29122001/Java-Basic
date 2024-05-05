package Bai1;

import java.util.Scanner;

public class Bai1_2 {
    public static void main(String[] args) {
        //Kiem tra so chan le
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen x: ");
        x=sc.nextInt();
        sc.close();
        if(x % 2==0){
            System.out.print("So vua nhap la so chan");
        }else {
            System.out.print("So vua nhap la so le");
        }
    }
}
