package bai1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.security.rsa.RSAUtil;

import java.util.Scanner;

public class chuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số cần chuyển: ");
        int number = nhap.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
            case 6:
                System.out.println("Six");
            case 7:
                System.out.println("Seven");
            case 8:
                System.out.println("Eight");
            case 9:
                System.out.println("Nine");
            case 10:
                System.out.println("Ten");
            case 11:
                System.out.println("Eleven");
            case 12:
                System.out.println("Twelve");
            case 13:
                System.out.println("Thirdteen");
            case 14:
                System.out.println("Fourteen");
            case 15:
                System.out.println("Fifteen");
            case 16:
                System.out.println("Sixteen");
            case 17:
                System.out.println("Seventeen");
            case 18:
                System.out.println("Eighteen");
            case 19:
                System.out.println("Nineteen");
            case 20:
                System.out.println("Twenty");
        }
    }
}
