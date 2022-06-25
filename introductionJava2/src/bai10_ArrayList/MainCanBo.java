package bai10_ArrayList;

import Practice.CanBo;
import Practice.QuanLyCanBo;

import java.util.Scanner;

public class MainCanBo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        int choice;
        int choice1;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Remove");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("1. Add Engineer");
                    System.out.println("2. Add Staff");
                    System.out.println("3. Add Worker");
                    choice1 = scanner.nextInt();
                    switch (choice1){
                    case 1: quanLyCanBo.addKySu(scanner);
                    break;
                    case 2: quanLyCanBo.addNhanVien(scanner);
                    break;
                    case 3: quanLyCanBo.addCongNhan(scanner);
                    break;

                }
                break;
                }
                case 3: quanLyCanBo.removeFirstCanBo(scanner);
                break;
                case 4: quanLyCanBo.displayAll();
                break;
            }
        }while(choice !=0);




    }
}
