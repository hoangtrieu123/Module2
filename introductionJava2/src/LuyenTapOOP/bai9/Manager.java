package LuyenTapOOP.bai9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Bill> Humans = new ArrayList();

    public Bill createHuman(Scanner scanner) {
        System.out.println("Nhập họ tên: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        String address = scanner.nextLine();
        System.out.println("Nhập mã số công tơ điện: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào chỉ số điện cũ");
        int old = scanner.nextInt();
        System.out.println("Nhập vào chỉ số điện mới: ");
        int new1 = scanner.nextInt();
        int price = (new1 - old) * 5;
        return new Bill(name, address, id, old, new1, price);
    }

    public void addHuman(Scanner scanner) {
        Bill bill = createHuman(scanner);
        Humans.add(bill);
        writeDocuments(Humans);
    }

    public void removeHuman(Scanner scanner) {
        String name;
        System.out.println("Nhập vào tên chủ hộ cần xóa: ");
        name = scanner.next();
        for (int i = 0; i < Humans.size(); i++) {
            if (Humans.get(i).getHoVaTen().equals(name)) {
                Humans.remove(i);

            }
        }
    }

    public void displayHuman() {
        for (Bill a : Humans) {
            System.out.println(a);
        }
    }

    public void editHuman(Scanner scanner) {
        String name = "";
        System.out.println("Nhập tên chủ hộ cần sửa: ");
        name = scanner.next();
        for (int i = 0; i < Humans.size(); i++) {
            if (Humans.get(i).getHoVaTen().equals(name)) {
                System.out.println("Nhập họ tên mới: ");
                String name1 = scanner.next();
                scanner.nextLine();
                System.out.println("Nhập số nhà mới: ");
                String address = scanner.nextLine();
                System.out.println("Nhập mã số công tơ điện mới: ");
                int id = scanner.nextInt();
                System.out.println("Nhập vào chỉ số điện cũ mới: ");
                int old = scanner.nextInt();
                System.out.println("Nhập vào chỉ số điện mới mới: ");
                int new1 = scanner.nextInt();
                int price = (new1 - old) * 5;
                Humans.get(i).setHoVaTen(name1);
                Humans.get(i).setSoNha(address);
                Humans.get(i).setMaSoCongTo(id);
                Humans.get(i).setChiSoDienCu(old);
                Humans.get(i).setChiSoDienMoi(new1);
                Humans.get(i).setSoTienPhaiTra(price);
            }
        }
    }

    public void calculatorPrice(Scanner scanner) {
        int price = 0;
        String name;
        System.out.println("Nhập vào tên chủ hộ cần tính tiền: ");
        name = scanner.next();
        for (int i = 0; i < Humans.size(); i++) {
            if (Humans.get(i).getHoVaTen().equals(name)) {
                price = (Humans.get(i).getChiSoDienMoi() - Humans.get(i).getChiSoDienCu()) * 5;
            }
        }
        System.out.println(price);
    }

    public void writeDocuments(ArrayList<Bill> humans) {
        File file = new File("demo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter write = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            for (Bill bill : Humans) {
                bufferedWriter.write(bill.getHoVaTen() + ", " + bill.getSoNha() + ", " + bill.getMaSoCongTo() + ", " + bill.getChiSoDienCu() + ", " + bill.getChiSoDienMoi() + ", " + bill.getSoTienPhaiTra());

            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Không tạo được file");
        }
    }

    public void readDocuments() {
        File file = new File("demo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(", ");
                Bill bill = new Bill(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), Integer.parseInt(strings[5]));
                Humans.add(bill);

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Không tạo được file");
        }

    }
}
