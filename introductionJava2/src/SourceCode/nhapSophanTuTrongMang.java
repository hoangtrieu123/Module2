package SourceCode;

import java.util.Scanner;

public class nhapSophanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];

        for (int i = 1; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextLine();
        }
        System.out.print("Các phần tử của mảng: ");
        show(arr);
    }

    public static void show(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
