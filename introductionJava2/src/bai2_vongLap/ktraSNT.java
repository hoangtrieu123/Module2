package bai2_vongLap;

public class ktraSNT {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;
        while (count < 20) {
            if (isPrime(number)) {
                count++;
                System.out.println(number);
            }
            number++;

        }

    }

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

