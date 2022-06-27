package LuyenTapOOP.BaiLuyenTap;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ProvinceManager implements Serializable {
    ArrayList<Province> provinces = new ArrayList<>();
    ArrayList<Country> countries = new ArrayList<>();

    public ProvinceManager() {
        countries.add(new Country("Anh"));
        countries.add(new Country("Nhật"));
        countries.add(new Country("Nga"));
        countries.add(new Country("Mỹ"));
        countries.add(new Country("Trung Quốc"));
        countries.add(new Country("Việt Nam"));
    }

    public Province createProvince(Scanner scanner) {
        System.out.println("Nhập quốc gia: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        Country country = null;
        for (int i = 0; i < countries.size(); i++) {
            if ((i + 1) == choice) {
                country = countries.get(i);
            }
        }
        System.out.println("Nhập tên tỉnh: ");
        String name = scanner.nextLine();
        System.out.println("Nhập GDP: ");
        int gdp = scanner.nextInt();
        System.out.println("Nhập vào dân số: ");
        int popular = scanner.nextInt();
        System.out.println("Nhập vào diện tích: ");
        int area = scanner.nextInt();
        return new Province(name, gdp, popular, area, country);
    }

    public void addProvince(Scanner scanner) {
        Province province = createProvince(scanner);
        provinces.add(province);
        writeDocuments(provinces);
    }

    public void displayProvince() {
        for (Province a : provinces) {
            System.out.println(a);
        }
    }

    public void editProvince(Scanner scanner) {
        System.out.println("Nhập vào tên tỉnh cần sửa: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i).getName().equals(name)) {
                System.out.println("Nhập tên tỉnh cần sửa: ");
                scanner.nextLine();
                String name1 = scanner.nextLine();
                System.out.println("Nhập GDP cần sửa: ");
                int gdp = scanner.nextInt();
                System.out.println("Nhập vào dân số cần sửa: ");
                int popular = scanner.nextInt();
                System.out.println("Nhập vào diện tích cần sửa: ");
                int area = scanner.nextInt();
                provinces.get(i).setName(name1);
                provinces.get(i).setGdp(gdp);
                provinces.get(i).setPopular(popular);
                provinces.get(i).setArea(area);
                writeDocuments(provinces);
            }
        }
    }

    public void removeProvince(Scanner scanner) {
        System.out.println("Nhập vào tên tỉnh cần xóa: ");
        scanner.nextLine();
        String province = scanner.nextLine();
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i).getName().equals(province)) {
                provinces.remove(i);
                writeDocuments(provinces);
            }
        }
    }

    public void displaySameCountry(Scanner scanner) {
        displayCountry();
        System.out.println("Nhập vào quốc gia: ");
        int index = Integer.parseInt(scanner.nextLine());
        Country country = null;
        for (int i = 0; i < countries.size(); i++) {
            if ((i + 1) == index) {
                country = countries.get(i);
            }
        }
        for (Province province : provinces) {
            if (province.getCountry().getName().equals(country.getName())) {
                System.out.println(province);
            }
        }
    }

    public void displayCountry() {
        for (int i = 0; i < countries.size(); i++) {
            System.out.println((i + 1) + ". " + countries.get(i).getName());
        }
    }
    public void searchByProvince(Scanner scanner) {
        System.out.println("Nhập vào tỉnh cần tìm: ");
        scanner.nextLine();
        String province = scanner.nextLine();
        for (Province p : provinces) {
            if (p.getName().equals(province)) {
                System.out.println(p);
            }
        }
    }

    public void writeDocuments(ArrayList<Province> provinces) {
        File file = new File("saveProvince.txt");
        try {
            if (file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(provinces);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("File đã tồn tại");
        }
    }

    public void readDocuments() {
        File file = new File("saveProvince.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            provinces = (ArrayList<Province>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("File đã tồn tại");
        }
    }
}
