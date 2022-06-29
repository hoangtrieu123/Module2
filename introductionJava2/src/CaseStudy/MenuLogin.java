package CaseStudy;

import java.util.Scanner;

public class MenuLogin {
    public static void LoginMenu() {
        ManagerRegister managerRegister = new ManagerRegister();
        Scanner scanner = new Scanner(System.in);
        managerRegister.readDocuments();
        System.out.println("--------Welcome to Hoàng Triều Store--------");
        System.out.println("|                                          |");
        System.out.println("|   Địa chỉ: Lương Khánh Thiện - Hà Nội    |");
        System.out.println("|   Số điện thoại: 0912081098              |");
        System.out.println("|                                          |");
        System.out.println("--------------------------------------------");
        int choice;
        do {
            System.out.println("1. Đăng ký tài khoản");
            System.out.println("2. Đăng nhập");

            System.out.print("Chọn đi khách iu <3: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerRegister.addAccount(scanner);
                    break;
                case 2:
                    managerRegister.inputAccount(scanner);
                    int choice1;
                    choice1 = Integer.parseInt(scanner.next());

                    if (choice1 == 1) {
                        MenuCustomer.Menu();
                    }
            }
        } while (choice != 0);
    }
}



