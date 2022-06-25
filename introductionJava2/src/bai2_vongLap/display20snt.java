package bai2_vongLap;

import java.util.Scanner;

public class display20snt {
    public static void main(String[] args) {
        int count = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần hiện: ");
        int number = nhap.nextInt();
        while (count <= 20){

            if ( number % number == 0 ){
                System.out.println(count + " là số nguyên tố");
                count++;
            }
        }
    }
}