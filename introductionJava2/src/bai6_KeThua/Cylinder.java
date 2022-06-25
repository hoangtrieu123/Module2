package bai6_KeThua;

import java.util.Scanner;

public class Cylinder extends Circle{
    public Cylinder(double radius, String color, double area, double height, double volume) {
        super(radius, color, area);
        this.height = height;
        this.volume = volume;
    }


    private double height;
    private double volume;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào Đường kính: ");
        int duongKinh = scanner.nextInt();
        Circle circle = new Circle();
        circle.setArea(1);
    }
}
