package luyenTap;

import java.util.Scanner;
public class ManagerStaff {
    int index = 0;
    Staff []staff;
    public Staff createStaff(Scanner nhap){
        System.out.println("Nhập vào id: ");
        int id = nhap.nextInt();
        System.out.print("Nhập tên: ");
        String name = nhap.next();
        System.out.print("Nhập tuổi: ");
        int age = nhap.nextInt();
        System.out.print("Nhập lương: ");
        int salary = nhap.nextInt();
        return new Staff(id,name,age,salary);
    }
    public void addStaff(Scanner nhap1){
        Staff staffs = createStaff(nhap1);
        staff[index]=staffs;
        index++;
    }
    public void arrayNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài hàm muốn tạo: ");
        int length = scanner.nextInt();
        staff = new Staff[length];
    }
//       public int checkId(int id) {
//           for (int i = 0; i < staff.length; i++) {
//                if (staff[i].getId() == id) {
//                    return i;
//                }
//           }return -1;
//        }
//    public boolean deleteStaff(int id){
//        if (checkId(id) != 1){
//            Staff[]staff = new Staff[this.staff.length-1];
//        }return true;
//    }
//    public int displayDeleteStaff(){
//        return 0;
//    }
     public void display(){
         for (Staff a: staff) {
             if (a !=null){
                 System.out.println(a);
             }
         }
     }

}
