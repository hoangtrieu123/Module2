package bai1;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào năm cần kiểm tra: ");
        int year = nhap.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " là năm nhuận");
        }else System.out.println(year + " là năm không nhuận");
    }
}
