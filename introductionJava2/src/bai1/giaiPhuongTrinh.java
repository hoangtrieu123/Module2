package bai1;

import java.util.Scanner;

public class giaiPhuongTrinh {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        float a = nhap.nextFloat();
        System.out.print("Nhập vào số b: ");
        float b = nhap.nextFloat();
        System.out.print("Nhập vào số c: ");
        float c = nhap.nextFloat();
        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            } else System.out.println("Phương trình vô nghiệm");
        } else {
            float result = (c - b) / a;
            System.out.println("x = " + result);
        }

    }

}
