package SourceCode;

public class checkSNT {
    public static boolean isPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
