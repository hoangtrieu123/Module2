package bai3_mang;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9};
        int length = array1.length + array2.length;
        int []result = new int[length];
        int element = 0;
        for ( int mang1: array1) {
            result[element]=mang1;
            element++;
        }
        for (int mang2: array2) {
            result[element]=mang2;
            element++;
        }
        System.out.println(Arrays.toString(result));
    }

}
