package bai3_mang;

import java.util.Scanner;

public class XoaMangVaThemSo0 {
    public static void main(String[] args) {
        int[] array = {3, 2, 6, 8, 9, 5};
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số cần xóa trong mảng: ");
        int number = nhap.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        display(array);
    }

    public static void display(int mang[]) {
        for (int number : mang) {
            System.out.print(number + ", ");
        }
    }
}
