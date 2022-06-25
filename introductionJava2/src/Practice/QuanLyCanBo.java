package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {

    ArrayList<CanBo> canBoArray = new ArrayList<>();

    public QuanLyCanBo() {

    }

    //    public CanBo createCanBo(Scanner scanner) {
//        System.out.println("Nhập vào tên: ");
//        String name = scanner.next();
//        System.out.println("Nhập vào tuổi");
//        int age = scanner.nextInt();
//        System.out.println("Nhập vào giới tính: ");
//        String gender = scanner.next();
//        System.out.println("Nhập vào địa chỉ: ");
//        String address = scanner.next();
//        return new CanBo(name, age, gender, address);
//    }
    public KySu createKySu(Scanner scanner) {
        System.out.println("Nhập vào tên: ");
        String name = scanner.next();
        System.out.println("Nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập vào giới tính: ");
        String gender = scanner.next();
        System.out.println("Nhập vào ngành đào tạo: ");
        String major = scanner.next();
        System.out.println("Nhập vào địa chỉ: ");
        String address = scanner.next();
        return new KySu(name, age, gender, major, address);
    }

    public NhanVien createNhanVien(Scanner scanner) {
        System.out.println("Nhập vào tên: ");
        String name = scanner.next();
        System.out.println("Nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập vào giới tính: ");
        String gender = scanner.next();
        System.out.println("Nhập vào công việc: ");
        String job = scanner.next();
        System.out.println("Nhập vào địa chỉ: ");
        String address = scanner.next();
        return new NhanVien(name, age, gender, job, address);
    }

    public CongNhan createCongNhan(Scanner scanner) {
        System.out.println("Nhập vào tên: ");
        String name = scanner.next();
        System.out.println("Nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập vào giới tính: ");
        String gender = scanner.next();
        System.out.println("Nhập vào bậc: ");
        int level = scanner.nextInt();
        System.out.println("Nhập vào địa chỉ: ");
        String address = scanner.next();
        return new CongNhan(name, age, gender, address, level);
    }

    //    public void addCanBo(Scanner scanner){
//        CanBo canBo = createCanBo(scanner);
//        canBoArray.add(canBo);
//    }
    public void addNhanVien(Scanner scanner) {
        NhanVien nhanVien = createNhanVien(scanner);
        canBoArray.add(nhanVien);
    }

    public void addKySu(Scanner scanner) {
        KySu kySu = createKySu(scanner);
        canBoArray.add(kySu);
    }

    public void addCongNhan(Scanner scanner) {
        CongNhan congNhan = createCongNhan(scanner);
        canBoArray.add(congNhan);
    }

    public void displayAll() {
        for (CanBo b : canBoArray) {
            System.out.println(b);
        }
    }

    public void removeFirstCanBo(Scanner scanner) {
        System.out.println("Nhập vào tên bạn muốn xóa: ");
        String name = scanner.next();
        int index = -1;
        for (int i = 0; i < canBoArray.size(); i++) {
            if (canBoArray.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1){
            canBoArray.remove(index);
        }else{
            System.out.println("Không có cán bộ cần xóa");
        }
    }
}
