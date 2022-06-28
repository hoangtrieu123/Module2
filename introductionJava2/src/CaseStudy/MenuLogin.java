package CaseStudy;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ManagerRegister managerRegister = new ManagerRegister();
        Scanner scanner = new Scanner(System.in);
        managerRegister.readDocuments();
        int choice;
        do {
            System.out.println("1. Đăng ký tài khoản");
            System.out.println("2. Đăng nhập");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerRegister.addAccount(scanner);
                    break;
                case 2:
                    managerRegister.inputAccount(scanner);
            }
        } while (choice != 0);

    }
}



