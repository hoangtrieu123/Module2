package bai1;

import java.util.Scanner;

public class tinhSoCanNang {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập cân nặng của bạn: ");
        float weight = nhap.nextFloat();
        System.out.print("Nhập chiều cao của bạn: ");
        float height = nhap.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi < 25.0){
            System.out.println("Normal");
        }else if (bmi < 30.0){
            System.out.println("Overweight");
        }else System.out.println("Obese");
    }
}