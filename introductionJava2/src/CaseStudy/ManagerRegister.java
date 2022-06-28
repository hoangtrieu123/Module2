package CaseStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageRegister {
    ArrayList<Register> arrayListRegister = new ArrayList<>();
    Register register = new Register();
    public Register account(Scanner scanner){
        System.out.println("1. Nhập tài khoản mới: ");
        String name = scanner.next();
        System.out.println("2. Nhập mật khẩu mới: ");
        String password = scanner.next();
        return new Register(name, password);
    }
    public void addAccount(Scanner scanner){
        Register register = account(scanner);
        arrayListRegister.add(register);
    }
    public void checkAccount(Scanner scanner){
        String check = "";
        for (int i = 0; i < arrayListRegister.size(); i++) {
            if (arrayListRegister.get(i).equals(check)){
                Menu.menu();
            }
        }
    }
}
