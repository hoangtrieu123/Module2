package luyenTap;

import java.util.Scanner;

public class MainStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStaff managerStaff = new ManagerStaff();

        int choice = 0;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Add Staff");
            System.out.println("2. Remove Staff");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    managerStaff.arrayNew();
                    for (int i = 0; i < managerStaff.staff.length; i++) {
                        managerStaff.addStaff(scanner);
                    }
                break;
//                case 2: managerStaff.deleteStaff(managerStaff.displayDeleteStaff());
//                break;
                case 3:  managerStaff.display();
                break;
            }
        }while(choice!=0);



    }
}
