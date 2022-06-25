package bai10_ArrayList;

import java.util.Scanner;

public class MainSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int choice;
        do {
            System.out.println("------Menu------");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Display");
            System.out.println("5. Find");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    danhSachSinhVien.addSinhVien(scanner);
                    break;
                case 2:
                    danhSachSinhVien.removeSv(scanner);
                    break;
                case 3:
                    danhSachSinhVien.updateSv(scanner);
                    break;
                case 4:
                    danhSachSinhVien.display();
                    break;
                case 5:
                    danhSachSinhVien.findSv(scanner);
                    break;
            }
        } while (choice != 0);
    }
}
