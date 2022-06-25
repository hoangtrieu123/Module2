package luyenTap;

import java.util.Scanner;

public class AnimalManagements {
    public Animal[] animals = new Animal[]{};
    public int index = 0;
    public AnimalManagements(int size){
        animals = new Animal[size];
    }
    public void addAnimal(Scanner scanner){
        Animal animal = createAnimal(scanner);
        animals[index] = animal;
        index++;
    }
    public Animal createAnimal(Scanner Scanner){
        System.out.println("Nhập chiều cao: ");
        int height = Scanner.nextInt();
        System.out.println("Nhập cân năng: ");
        int weight = Scanner.nextInt();
        System.out.println("Nhập giới tính: ");
        String gender = Scanner.nextLine();
        System.out.println("Nhạp màu: ");
        String color = Scanner.nextLine();
    return new Animal(height,weight,gender,color);
    }
    public void displayAnimal(){
        for (Animal animal : animals);{

            if (animals!= null){
                System.out.println(animals);
            }
        }
    }
}
