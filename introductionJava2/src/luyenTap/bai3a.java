package luyenTap;

import java.util.Scanner;

public class bai3a {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        int num;
        do {
            System.out.print("Nhập vào số cần kiểm tra: ");
            num = prime.nextInt();
            if (checkPrime.isPrime(num)) {
                System.out.println("Đây là số nguyên tố");
            } else System.out.println("Đây không phải là số nguyên tố");
        } while (num != 0);

    }
}
