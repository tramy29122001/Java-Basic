package Bai2;

import java.util.Scanner;

public class Bai2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu: ");
        String input = sc.nextLine();
        //Hien thi chuoi ban dau
        System.out.println("Chuoi ban dau la: "+input);
        input = input.toLowerCase();
        System.out.println("Chuoi in hoa: "+input);
    }
}
