package LuyenTapOOP.bai6;

import LuyenTapOOP.bai6.ManagerHuman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerHuman managerHuman = new ManagerHuman();
//
//        managerHuman.display();
//        managerHuman.displayStudent20Age();
//        managerHuman.displayStudent23AgeAndDN();
        int choice;
        int choice1;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Hiển thị tất cả học sinh");
            System.out.println("3. Hiển thị học sinh 20 tuổi");
            System.out.println("4. Hiển thị học sinh 23 tuổi và đến từ Đà Nẵng");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("lớp 1");
                    System.out.println("lớp 2");
                    System.out.println("lớp 3");
                    choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            managerHuman.addStudent(scanner);
                            break;
                        case 2:
                            managerHuman.addStudent(scanner);
                            break;
                        case 3:
                            managerHuman.addStudent(scanner);
                            break;
                    }
                    break;
                case 2:
                    managerHuman.display();
                    break;
                case 3:
                    managerHuman.displayStudent20Age();
                    break;
                case 4:
                    managerHuman.displayStudent23AgeAndDN();
                    break;
            }
        } while (choice != 0);
    }
}
