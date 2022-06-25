package bai10_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManager {
    //tạo 1 mảng arraylist
    ArrayList<Staff> arrayStaff = new ArrayList<>();
// tạo 1 phương thức createstaff để tạo staff
    public Staff createStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("NHập vào tên: ");
        String name = input.next();
        System.out.println("Nhập vào tuổi: ");
        int age = input.nextInt();
        System.out.println("Nhập vào giới tính: ");
        String gender = input.next();
        System.out.println("Nhập vào lương: ");
        double salary = input.nextDouble();
        return new Staff(name, age, gender, salary);
    }

    public void addStaff() {
        Staff staff = createStaff();
        arrayStaff.add(staff);
    }
}
