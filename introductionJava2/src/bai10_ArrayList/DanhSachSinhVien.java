package bai10_ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public SinhVien creatSinhVien(Scanner input) {
        System.out.println("Nhập vào tên sinh viên: ");
        String name = input.next();
        System.out.println("Nhập vào giới tính: ");
        String gender = input.next();
        System.out.println("Nhập vào năm sinh: ");
        int year = input.nextInt();
        System.out.println("Nhập vào điểm trung bình: ");
        double point = input.nextDouble();
        return new SinhVien(name, gender, year, point);
    }

    public void addSinhVien(Scanner input1) {
        SinhVien sinhVien = creatSinhVien(input1);
        danhSach.add(sinhVien);
    }

    public void display() {
        for (SinhVien a : danhSach) {
            System.out.println(a);
        }
    }

    public void removeSv(Scanner input2) {
        System.out.println("Nhập vào index bạn muốn xóa: ");
        int index = input2.nextInt();
        input2.nextLine();
        if (index < 0 || index >= danhSach.size()) {
            System.out.println("Không có index này");
        } else {
            danhSach.remove(index);
        }
    }

    public void updateSv(Scanner input3) {
        System.out.println("Nhập vào index muốn cập nhật: ");
        int index = input3.nextInt();
        input3.nextLine();
        if (index < 0 || index >= danhSach.size()) {
            System.out.println("Không có index này");
        } else {
            SinhVien sinhVien = danhSach.get(index);
            System.out.println("Nhập lại tên: ");
            String name = input3.nextLine();
            sinhVien.setHoVaTen(name);
            System.out.println("Nhập lại giới tính: ");
            String gender = input3.nextLine();
            sinhVien.setGioiTinh(gender);
            System.out.println("Nhập lại tuổi: ");
            int age = input3.nextInt();
            sinhVien.setNamSinh(age);
            System.out.println("Nhập lại điểm trung bình: ");
            double average = input3.nextDouble();
            sinhVien.setDiemTrungBinh(average);
            danhSach.set(index,sinhVien);
        }
    }
    public void  findSv(Scanner input4){
        System.out.println("Nhập vào index cần tìm: ");
        int index = input4.nextInt();
        input4.next();
        if(index < 0 || index >= danhSach.size() ){
            System.out.println("Không có index này để tìm: ");
        }else{
            System.out.println( danhSach.get(index));
        }
    }
}
