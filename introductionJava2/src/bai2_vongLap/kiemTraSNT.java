package bai2_vongLap;

import java.util.Scanner;

public class kiemTraSNT {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int number = nhap.nextInt();
        boolean flag = true;
        if (number < 2) {
            flag = true;
        }
        for (int i = 0; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + " không phải là số nguyên tố");
        } else
            System.out.println(number + " là số nguyên tố");
    }
}
