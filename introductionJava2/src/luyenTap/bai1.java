package luyenTap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1)+ ": ");
            arr[i] = scanner.nextLine();
        }
        System.out.print("Các phần tử của mảng: ");

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
