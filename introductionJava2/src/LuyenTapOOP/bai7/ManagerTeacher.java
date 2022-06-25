package LuyenTapOOP.bai7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerTeacher {
    public ManagerTeacher() {
    }

    ArrayList<Teacher> teachers = new ArrayList();

    public Teacher createTeacher(Scanner scanner) {
        System.out.println("Nhập vào họ tên: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào quê: ");
        String homeTown = scanner.nextLine();
        System.out.println("Nhập vào mã giáo viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào lương cứng: ");
        double salary = scanner.nextDouble();
        System.out.println("nhập vào lương thưởng: ");
        double bonus = scanner.nextDouble();
        System.out.println("Nhập vào tiền phạt");
        double fine = scanner.nextDouble();
        return new Teacher(name, age, homeTown, id, salary, bonus, fine);
    }

    public void addTeacher(Scanner scanner) {
        Teacher teacher = createTeacher(scanner);
        teachers.add(teacher);
        writeDocuments(teachers);
    }

    public void displayTeacher() {
        for (Teacher a : teachers) {
            System.out.println(a);
        }
    }

    public void removeTeacher(Scanner scanner) {
        int id;
        System.out.println("Nhập vào id giáo viên cần xóa: ");
        id = scanner.nextInt();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                teachers.remove(i);
            }
        }
    }

    public void calculatorSalary(Scanner scanner) {
        System.out.println("Nhập vào id giáo viên cần tính lương: ");
        double salary = getSalary(scanner);
        System.out.println(salary);
    }

    private double getSalary(Scanner scanner) {
        int id;
        double salary = 0;
        id = scanner.nextInt();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                salary = teachers.get(i).getSalary() + teachers.get(i).getBonusSalary() - teachers.get(i).getFine();
            }
        }
        return salary;
    }

    public void writeDocuments(ArrayList<Teacher> teachers) {
        File file = new File("ghiGiaoVien.txt");
        try {
            if (file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(teachers);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("File đã tồn tại");
        }

    }
    public void readDocuments(){
        File file = new File("ghiGiaoVien.txt");
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            teachers = (ArrayList<Teacher>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
