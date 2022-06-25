package LuyenTapOOP.bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        manager.readDocuments();

        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Thêm hộ gia đình");
            System.out.println("2. Sửa thông tin");
            System.out.println("3. Xóa hộ gia đình");
            System.out.println("4. Hiển thị hộ gia đình");
            System.out.println("5. Tính tiền");
            System.out.println("0. Thoát chương trình");
            while (true){
                try{
                    System.out.print("Nhập lựa chọn: ");
                    choice = scanner.nextInt();
                    break;
                }catch(Exception e){
                    System.out.println("Nhập vào số đi");
                    scanner.nextLine();
                }

            }

            switch (choice) {
                case 1:
                    manager.addHuman(scanner);
                    break;
                case 2:
                    manager.editHuman(scanner);
                    break;
                case 3:
                    manager.removeHuman(scanner);
                    break;
                case 4:
                    manager.displayHuman();
                    break;
                case 5:
                    manager.calculatorPrice(scanner);
            }
        } while (choice != 0);
    }
}
