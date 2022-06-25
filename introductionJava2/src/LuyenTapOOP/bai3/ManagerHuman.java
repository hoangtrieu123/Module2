package LuyenTapOOP.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman {
    ArrayList<Human> humanList = new ArrayList();

    public ManagerHuman(ArrayList<Human> humanList) {
        this.humanList = humanList;
    }
    public ManagerHuman() {

    }
    public ClassA createClassA(Scanner scanner){
        System.out.println("Nhập vào tên thí sinh: ");
        String name = scanner.next();
        System.out.println("Nhập vào địa chỉ thí sinh: ");
        String address = scanner.next();
        System.out.println("Nhập vào id thí sinh: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào độ ưu tiên: ");
        int priority = scanner.nextInt();
        return new ClassA(name,address,id,priority);
    }
    public ClassB createClassB(Scanner scanner){
        System.out.println("Nhập vào tên thí sinh: ");
        String name = scanner.next();
        System.out.println("Nhập vào địa chỉ thí sinh: ");
        String address = scanner.next();
        System.out.println("Nhập vào id thí sinh: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào độ ưu tiên: ");
        int priority = scanner.nextInt();
        return new ClassB(name,address,id,priority);
    }
    public ClassC createClassC(Scanner scanner){
        System.out.println("Nhập vào tên thí sinh: ");
        String name = scanner.next();
        System.out.println("Nhập vào địa chỉ thí sinh: ");
        String address = scanner.next();
        System.out.println("Nhập vào id thí sinh: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào độ ưu tiên: ");
        int priority = scanner.nextInt();
        return new ClassC(name,address,id,priority);
    }
    public void addClassA(Scanner scanner){
        ClassA classA = createClassA(scanner);
        humanList.add(classA);
    }
    public void addClassB(Scanner scanner){
        ClassB classB = createClassB(scanner);
        humanList.add(classB);
    }
    public void addClassC(Scanner scanner){
        ClassC classC = createClassC(scanner);
        humanList.add(classC);
    }
    public void displayHuman(){
        for (Human e: humanList) {
            System.out.println(e);
        }
    }
    public void searchHuman(Scanner scanner){
        System.out.println("Nhập vào id bạn cần tìm: ");
        int id = scanner.nextInt();
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getId() == id ){
                System.out.println(humanList.get(i));
            }else {
                System.out.println("Không có thí sinh nào cần tìm");
            }
        }
    }
}
