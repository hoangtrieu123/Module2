package LuyenTapOOP.bai3;

import java.util.Scanner;

public class MainHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerHuman managerHuman = new ManagerHuman();
        int choice;
        int choice1;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add Candidates");
            System.out.println("2. Display Candidates");
            System.out.println("3. Search Candidates by id");
            System.out.println("0. Exit Program");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Candidates of class A");
                    System.out.println("2. Candidates of class B");
                    System.out.println("3. Candidates of class C");
                    choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            managerHuman.addClassA(scanner);
                            break;
                        case 2:
                            managerHuman.addClassB(scanner);
                            break;
                        case 3:
                            managerHuman.addClassC(scanner);
                            break;
                    }
                    break;
                case 2: managerHuman.displayHuman();
                break;
                case 3: managerHuman.searchHuman(scanner);
            }
        } while (choice != 0);
    }
}
