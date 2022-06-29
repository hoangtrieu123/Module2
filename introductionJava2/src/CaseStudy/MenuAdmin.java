package CaseStudy;

import java.util.Scanner;

public class MenuAdmin {
    public static void Menu() {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        productManager.readDocuments();
        int choice;
        do {
            System.out.println("--------Welcome to Hoàng Triều Store--------");
            System.out.println("|                                          |");
            System.out.println("|   Địa chỉ: Lương Khánh Thiện - Hà Nội    |");
            System.out.println("|   Số điện thoại: 0912081098              |");
            System.out.println("|                                          |");
            System.out.println("--------------------------------------------");
            System.out.println("----Menu Quản lý----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Tìm sản phẩm theo ID");
            System.out.println("5. Hiển thị toàn bộ sản phẩm của shop");
            System.out.println("6. Hiển thị các tài khoản đã đăng ký");
            System.out.println("7. Xóa tài khoản khách");
            System.out.println("0. Đăng xuất");
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    System.out.println("Nhập vào id sản phẩm cần sửa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("1. Sửa tên sản phẩm");
                    System.out.println("2. Sửa giá sản phẩm");
                    System.out.println("3. Sửa số lượng sản phẩm");
                    System.out.println("4. Sửa kích cỡ sản phẩm");
                    System.out.print("Nhập lựa chọn của bạn: ");

                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            productManager.editProductName(scanner, id);
                            break;
                        case 2:
                            productManager.editProducePrice(scanner, id);
                            break;
                        case 3:
                            productManager.editProduceAmount(scanner, id);
                            break;
                        case 4:
                            productManager.editProduceSize(scanner, id);
                            break;
                    }
                    break;
                case 3:
                    productManager.deleteProduct(scanner);
                    break;
                case 4:
                    productManager.searchById(scanner);
                    break;
                case 5:
                    productManager.displayProduct();
                    break;
                case 6:
                    ManagerRegister.displayAccount();
                    break;
                case 7:
                    ManagerRegister.deleteAccount(scanner);
                    break;
                case 0:
                    MenuLogin.LoginMenu();
                    break;
            }
        } while (choice != 0);
    }
}
