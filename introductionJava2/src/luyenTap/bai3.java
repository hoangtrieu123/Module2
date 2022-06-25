package luyenTap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào một số cần kiểm tra: ");
        int number = nhap.nextInt();
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Đây là số nguyên tố");
            } else System.out.println("Đây không phải là số nguyên tố");
        }

    }
}
