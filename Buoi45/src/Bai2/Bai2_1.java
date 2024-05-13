package Bai2;

import java.util.Scanner;

public class Bai2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();
        //Hien thi chuoi ban dau
        System.out.println("Chuoi ban dau la: "+input);
        input=input.replaceAll(" ","");
        System.out.println("Chuoi sau khi xoa la: "+input);
    }
}
