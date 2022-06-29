package CaseStudy;

import java.io.Serializable;

public class Product implements Serializable {
    public static int ID = 0;
    private int id;
    private String name;
    private double price;
    private int amount;
    private String size;

    public Product(int id, String name, double price, int amount, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.size = size;
    }

    public Product() {
    }

    public Product(String name, double price, int amount, String size) {
        try {
            ID = ProductManager.arrayListProduct.get(ProductManager.arrayListProduct.size() - 1).getId();
        } catch (Exception e) {
            ID = 0;
        }
        this.id = ++ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", size='" + size + '\'' +
                '}';
    }
}
