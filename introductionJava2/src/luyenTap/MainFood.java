package luyenTap;

import java.util.Scanner;

public class MainFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng: ");
        int size = scanner.nextInt();
        FoodManagements foodManagements = new FoodManagements();
        foodManagements.array(size);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhập:");
            System.out.println("2. Hiển thị:");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    foodManagements.addFood(scanner);
                    break;
                case 2:
                    foodManagements.display(scanner);
                    break;
            }
        }while (choice != 0) ;
    }
}
