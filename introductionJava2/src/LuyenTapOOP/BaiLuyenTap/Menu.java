package LuyenTapOOP.BaiLuyenTap;

import java.util.Scanner;

public class Menu {
    public static void menu(Scanner scanner) {
        ProvinceManager provinceManager = new ProvinceManager();
        provinceManager.readDocuments();
        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Thêm ");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Hiển thị tất cả");
            System.out.println("5. Hiển thị tỉnh có chung đất nước ");
            System.out.println("6. Tìm kiếm tỉnh theo tên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                   provinceManager.displayCountry();
                    provinceManager.addProvince(scanner);
                    break;
                case 2:
                    provinceManager.editProvince(scanner);
                    break;
                case 3:
                    provinceManager.removeProvince(scanner);
                    break;
                case 4:
                    provinceManager.displayProvince();
                    break;
                case 5:
                    provinceManager.displaySameCountry(scanner);
                    break;
                case 6:
                    provinceManager.searchByProvince(scanner);
                    break;
            }
        }
        while (choice != 0);
    }
}
