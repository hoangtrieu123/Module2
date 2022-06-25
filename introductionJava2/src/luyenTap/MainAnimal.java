package luyenTap;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng chứa pet: ");
        int size = scanner.nextInt();
        AnimalManagements AnimalManagements = new AnimalManagements(size);
    }
}
