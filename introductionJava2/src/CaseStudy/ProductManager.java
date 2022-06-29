package CaseStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements Serializable {
    public static ArrayList<Product> arrayListProduct = new ArrayList<>();

    public Product creatProduct(Scanner scanner) {
        System.out.println("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập size: ");
        String size = scanner.nextLine();
        return new Product(name, price, amount, size);

    }

    public void addProduct(Scanner scanner) {
        Product product = creatProduct(scanner);
        arrayListProduct.add(product);
        writeDocuments(arrayListProduct);
    }

    public void displayProduct() {

        for (Product p : arrayListProduct) {
            System.out.println(p);
        }
    }

    public void searchById(Scanner scanner) {
        System.out.println("Nhập vào id sản phẩm cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product b : arrayListProduct) {
            if (b.getId() == id) {
                System.out.println(b);
            }
        }
    }

    public void deleteProduct(Scanner scanner) {
        System.out.println("Nhập vào id sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product pr : arrayListProduct) {
            if (pr.getId() == id) {
                arrayListProduct.remove(pr);
                writeDocuments(arrayListProduct);
                break;
            }
        }
    }

    public void editProductName(Scanner scanner, int id) {
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if (arrayListProduct.get(i).getId() == (id)) {
                System.out.println("Nhập tên sản phẩm cần sửa: ");
                String name = scanner.nextLine();
                arrayListProduct.get(i).setName(name);
            }
        }
    }
    public void editProducePrice(Scanner scanner, int id){
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if (arrayListProduct.get(i).getId() == (id)) {
                System.out.println("Nhập giá sản phẩm cần sửa: ");
                double price = Double.parseDouble(scanner.nextLine());
                arrayListProduct.get(i).setPrice(price);
            }
        }
    }
    public void editProduceAmount(Scanner scanner, int id){
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if (arrayListProduct.get(i).getId() == (id)) {
                System.out.println("Nhập số lượng sản phẩm cần sửa: ");
                int amount = Integer.parseInt(scanner.nextLine());
                arrayListProduct.get(i).setAmount(amount);
            }
        }
    }
    public void editProduceSize(Scanner scanner, int id){
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if (arrayListProduct.get(i).getId() == (id)) {
                System.out.println("Nhập kích cỡ sản phẩm cần sửa: ");
                String size = scanner.nextLine();
                arrayListProduct.get(i).setSize(size);
            }
        }
    }
    public void writeDocuments(ArrayList<Product> arrayListProduct) {
        File file = new File("Product.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(arrayListProduct);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("File đã tồn tại");
        }
    }

    public void readDocuments() {
        File file = new File("Product.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            arrayListProduct = (ArrayList<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("File đã tồn tại");
        }
    }
}
