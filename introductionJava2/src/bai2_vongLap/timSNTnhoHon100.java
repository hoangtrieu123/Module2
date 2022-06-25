package bai2_vongLap;

public class timSNTnhoHon100 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 100){
            if(ktraSNT.isPrime(number)){
                System.out.println(number);
            }
            number++;
        }
    }
}
