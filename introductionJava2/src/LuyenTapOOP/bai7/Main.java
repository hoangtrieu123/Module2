package LuyenTapOOP.bai7;

import LuyenTapOOP.bai7.ManagerTeacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTeacher managerTeacher = new ManagerTeacher();
        managerTeacher.readDocuments();
        int choice;
        do {

            System.out.println("-----MENU-----");
            System.out.println("1. Thêm giáo viên");
            System.out.println("2. Xóa giáo viên ");
            System.out.println("3. Hiển thị giáo viên");
            System.out.println("4. Tính lương cho giáo viên");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerTeacher.addTeacher(scanner);
                    break;
                case 2:
                    managerTeacher.removeTeacher(scanner);
                    break;
                case 3:
                    managerTeacher.displayTeacher();
                    break;
                case 4:
                    managerTeacher.calculatorSalary(scanner);
                    break;
            }
        } while (choice != 0);
    }

}
