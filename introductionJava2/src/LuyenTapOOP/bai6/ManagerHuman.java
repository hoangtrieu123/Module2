package LuyenTapOOP.bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman {
    ArrayList<Human> Humans = new ArrayList();

    public ManagerHuman() {
    }

    public Human createHuman(Scanner scanner) {
        System.out.println("Nhập vào tên học sinh: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập vào tuổi học sinh: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào quê của học sinh");
        String homeTown = scanner.nextLine();
        return new Human(name, age, homeTown);
    }

    public void addStudent(Scanner scanner) {
        Human human = createHuman(scanner);
        Humans.add(human);
    }

    public void display() {
        for (Human a : Humans) {
            System.out.println(a);
        }
    }

    public void displayStudent20Age() {
        for (Human a : Humans) {
            if (a.getAge() == 20) {
                System.out.println(a);
            }
        }
    }

    public void displayStudent23AgeAndDN() {
        String dn = "Đà Nẵng";
        int count = getCountByHomeTown(dn);
        System.out.println("Có tổng số " + count + " học sinh 23 tuổi và đến từ Đà Nẵng");
    }

    public int getCountByHomeTown(String dm) {
        int count = 0;
        for (Human b : Humans) {
            if (b.getAge() == 23 && b.getHomeTown().equals(dm)) {
                count++;
            }
        }
        return count;
    }

}
