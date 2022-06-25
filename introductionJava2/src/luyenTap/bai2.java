package luyenTap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        int numberA = nhap.nextInt();
        System.out.print("Nhập vào số b: ");
        int numberB = nhap.nextInt();
        System.out.print("Nhập vào số c: ");
        int numberC = nhap.nextInt();
        if (numberA > 0 && numberB > 0 && numberC > 0) {
            if (numberA + numberB > numberC && numberA + numberC > numberB && numberC + numberB > numberA) {
                System.out.println("Đây là tam giác");
            }else System.out.println("Đây không phải là tam giác");
        }else System.out.println("Đây không phải là tam giác");
    }
}
