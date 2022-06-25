package luyenTap;

import java.util.Scanner;

public class FoodManagements {
    public  food[] Food = new food[]{};
    public int index=0;

    public void array(int size){
        Food = new food[size];
    }

    public void addFood(Scanner scanner){
        food food1 = createFood(scanner);
        Food[index]= food1;
        index++;
    }

    public food createFood(Scanner scanner){
        System.out.println("Nhập tên sản phẩm: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = scanner.nextInt();
        System.out.println("Nhập số lượng sản phẩm: ");
        int amount = scanner.nextInt();
        return new food(name,price,amount);
    }

    public void display(Scanner scanner){
        for (food a:Food) {
            if (a != null){
                System.out.println(a);
            }
        }
    }
}
